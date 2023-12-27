package dvocas13_utorak.zadatak1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class BlogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField naslovField;
	private JTextArea textArea;
	private List<BlogPost> postovi = new ArrayList<BlogPost>();
	private JTextField textImeFajla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlogGUI frame = new BlogGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BlogGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 10));
		contentPane.add(panel, BorderLayout.WEST);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.setPreferredSize(new Dimension(95, 23));
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String naslov = naslovField.getText();
				String sadrzaj = textArea.getText();
				
				try {
					BlogPost post = new BlogPost();
					post.setNaslov(naslov);
					post.setSadrzaj(sadrzaj);
					// BlogPost post = new BlogPost(naslov, sadrzaj);
					
					postovi.add(post);
				} catch(RuntimeException ex) {
					JOptionPane.showMessageDialog(contentPane, ex.getMessage() , "Greska", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel.add(btnDodaj);
		
		JButton btnPrikazi = new JButton("Prikazi");
		btnPrikazi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				for(BlogPost post : postovi) {
					textArea.append("Naslov: " + post.getNaslov()+"\n");
					textArea.append("Sadrzaj: "+ post.getSadrzaj()+"\n\n");
				}
			
			}
		});
		btnPrikazi.setPreferredSize(new Dimension(95, 23));
		panel.add(btnPrikazi);
		
		JLabel lblImeFajla = new JLabel("Ime fajla:");
		lblImeFajla.setPreferredSize(new Dimension(95, 14));
		panel.add(lblImeFajla);
		
		textImeFajla = new JTextField();
		panel.add(textImeFajla);
		textImeFajla.setColumns(10);
		
		JLabel lblFormat = new JLabel("Format:");
		panel.add(lblFormat);
		
		JComboBox formatComboBox = new JComboBox();
		formatComboBox.setModel(new DefaultComboBoxModel(new String[] {"TXT", "BIN", "JSON"}));
		panel.add(formatComboBox);
		
		JButton btnSacuvaj = new JButton("Sacuvaj");
		btnSacuvaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String imeFajla = textImeFajla.getText();
				String format = formatComboBox.getSelectedItem().toString();
			
				if (format.equals("TXT")) {
					// sacuvaj u tekstualnom formatu
					sacuvajUTekstualnomFormatu(imeFajla);
				} else if (format.equals("BIN")) {
					// sacuvaj u binarnom formatu
					sacuvajUBinarnomFormatu(imeFajla);
				} else if (format.equals("JSON")) {
					sacuvajUJsonFormatu(imeFajla);
				}
			
			}

			private void sacuvajUJsonFormatu(String imeFajla) {
				try(PrintWriter out = new PrintWriter(imeFajla+".json")) {					
					for(BlogPost post : postovi) {
						out.println(post.toJson());
					}
					JOptionPane.showMessageDialog(contentPane, "Postovi su sacuvani u json fajl: "+imeFajla);					
				} catch(Exception e) {
					JOptionPane.showMessageDialog(contentPane, e.getMessage());
				}

				
			}

			private void sacuvajUBinarnomFormatu(String imeFajla) {
				try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(imeFajla))) {
					for(BlogPost post : postovi) {
						out.writeObject(post);
					}
					
					JOptionPane.showMessageDialog(contentPane, "Postovi su sacuvani u binarni fajl: "+imeFajla);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

			private void sacuvajUTekstualnomFormatu(String imeFajla) {
				try(PrintWriter out = new PrintWriter(imeFajla+".txt")) {					
					for(BlogPost post : postovi) {
						out.println(post.getNaslov());
						out.println(post.getSadrzaj());
					}
					JOptionPane.showMessageDialog(contentPane, "Postovi su sacuvani u fajl: "+imeFajla);					
				} catch(Exception e) {
					JOptionPane.showMessageDialog(contentPane, e.getMessage());
				}
				
			}
		});
		btnSacuvaj.setPreferredSize(new Dimension(95, 23));
		panel.add(btnSacuvaj);
		
		JButton btnIzadji = new JButton("Izadji");
		btnIzadji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// int odgovor = JOptionPane.showConfirmDialog(parentComponent, message) OptionDialog(contentPane, "Da li ste sigurni da hocete da izadjete?", "Potvrdite izlazak", JOptionPane.YES_NO_OPTION);
				int odgovor = JOptionPane.showConfirmDialog(contentPane,
															"Da li ste sigurni da hocete da izadjete?",
															"Potvrdite izlazak",
															JOptionPane.YES_NO_OPTION);
				if (odgovor == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			
			}
		});
		btnIzadji.setPreferredSize(new Dimension(95, 23));
		panel.add(btnIzadji);
		
		JPanel panel_1 = new JPanel();
		panel_1.setMinimumSize(new Dimension(500, 10));
		panel_1.setPreferredSize(new Dimension(500, 60));
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Naslov: ");
		panel_1.add(lblNewLabel);
		
		naslovField = new JTextField();
		panel_1.add(naslovField);
		naslovField.setColumns(35);
		
		textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
	}
}
