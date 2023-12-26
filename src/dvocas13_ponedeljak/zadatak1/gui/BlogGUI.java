package dvocas13_ponedeljak.zadatak1.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dvocas13_ponedeljak.zadatak1.poslovna_logika.Blog;
import dvocas13_ponedeljak.zadatak1.poslovna_logika.BlogPost;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BlogGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField poljeNaslov;
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JTextField poljeFajl;
	private JComboBox comboBox;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTextArea textArea;
	
	private Blog blog;

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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				izadji();
			}
		});
		blog = new Blog();
		
		setTitle("Program za pisanje blog-a");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 681, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.NORTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		contentPane.add(getPanel_1(), BorderLayout.WEST);
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getLblNewLabel());
			panel.add(getPoljeNaslov());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Naslov blog posta");
		}
		return lblNewLabel;
	}
	private JTextField getPoljeNaslov() {
		if (poljeNaslov == null) {
			poljeNaslov = new JTextField();
			poljeNaslov.setColumns(40);
		}
		return poljeNaslov;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(110, 10));
			panel_1.setLayout(null);
			panel_1.add(getBtnNewButton());
			panel_1.add(getBtnNewButton_1());
			panel_1.add(getLblNewLabel_1());
			panel_1.add(getPoljeFajl());
			panel_1.add(getComboBox());
			panel_1.add(getBtnNewButton_2());
			panel_1.add(getBtnNewButton_3());
		}
		return panel_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj post");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						BlogPost post = new BlogPost();
						
						post.setNaslov(poljeNaslov.getText());
						post.setSadrzaj(textArea.getText());
						
						blog.dodajPost(post);
						
						poljeNaslov.setText(null);
						textArea.setText(null);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(
								rootPane, 
								e1.getMessage(),
								"Greska",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnNewButton.setBounds(5, 5, 95, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Prikazi sve");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					
					List<BlogPost> postovi =
						blog.getPostovi();
					
					for(BlogPost post: postovi)
						textArea.append(post.toString());
					
				}
			});
			btnNewButton_1.setBounds(5, 51, 95, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Fajl putanja");
			lblNewLabel_1.setBounds(5, 98, 95, 14);
		}
		return lblNewLabel_1;
	}
	private JTextField getPoljeFajl() {
		if (poljeFajl == null) {
			poljeFajl = new JTextField();
			poljeFajl.setBounds(5, 123, 95, 20);
			poljeFajl.setColumns(10);
		}
		return poljeFajl;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"TXT", "JSON", "SERIJALIZACIJA"}));
			comboBox.setBounds(5, 154, 95, 22);
		}
		return comboBox;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Sacuvaj");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String fajl = poljeFajl.getText();
						
						String format = (String) comboBox.getSelectedItem();
						
						if (format.equals("JSON"))
							blog.sacuvajBlogJSON(fajl);
						else
							if (format.equals("TXT"))
								blog.sacuvajBlogTXT(fajl);
							else
								blog.serijalizujBlog(fajl);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(
								rootPane, 
								e1.getMessage(),
								"Greska",
								JOptionPane.ERROR_MESSAGE);
					}
					
					
				}
			});
			btnNewButton_2.setBounds(1, 195, 99, 23);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("Izadji");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					izadji();
				}
			});
			btnNewButton_3.setBounds(2, 229, 98, 23);
		}
		return btnNewButton_3;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}

	private void izadji() {
		int opcija = JOptionPane.showConfirmDialog(
				rootPane,
				"Da li zaista zelite da izadjete iz programa?", 
				"Potvrda",
				JOptionPane.YES_NO_CANCEL_OPTION);
		
		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
}
