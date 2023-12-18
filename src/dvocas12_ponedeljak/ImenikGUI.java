package dvocas12_ponedeljak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dvocas12_ponedeljak.zadatak1.poslovna_logika.Osoba;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class ImenikGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField poljeZaIme;
	private JTextField poljeZaAdresu;
	private JTextField poljeZaPrezime;
	private JTextField poljeZaTelefon;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	private List<Osoba> osobe = new ArrayList<Osoba>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImenikGUI frame = new ImenikGUI();
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
	public ImenikGUI() {
		setResizable(false);
		setTitle("Telefonski imenik");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getPoljeZaIme());
		contentPane.add(getPoljeZaAdresu());
		contentPane.add(getPoljeZaPrezime());
		contentPane.add(getPoljeZaTelefon());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getScrollPane());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Ime");
			lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel.setBounds(10, 11, 149, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Adresa");
			lblNewLabel_1.setBounds(203, 11, 117, 14);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Prezime");
			lblNewLabel_2.setBounds(10, 86, 46, 14);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Telefon");
			lblNewLabel_3.setBounds(203, 86, 46, 14);
		}
		return lblNewLabel_3;
	}
	private JTextField getPoljeZaIme() {
		if (poljeZaIme == null) {
			poljeZaIme = new JTextField();
			poljeZaIme.setBounds(10, 36, 176, 20);
			poljeZaIme.setColumns(10);
		}
		return poljeZaIme;
	}
	private JTextField getPoljeZaAdresu() {
		if (poljeZaAdresu == null) {
			poljeZaAdresu = new JTextField();
			poljeZaAdresu.setBounds(203, 36, 176, 20);
			poljeZaAdresu.setColumns(10);
		}
		return poljeZaAdresu;
	}
	private JTextField getPoljeZaPrezime() {
		if (poljeZaPrezime == null) {
			poljeZaPrezime = new JTextField();
			poljeZaPrezime.setBounds(10, 110, 176, 20);
			poljeZaPrezime.setColumns(10);
		}
		return poljeZaPrezime;
	}
	private JTextField getPoljeZaTelefon() {
		if (poljeZaTelefon == null) {
			poljeZaTelefon = new JTextField();
			poljeZaTelefon.setBounds(203, 111, 176, 20);
			poljeZaTelefon.setColumns(10);
		}
		return poljeZaTelefon;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String ime = poljeZaIme.getText();
						String prezime = poljeZaPrezime.getText();
						String adresa = poljeZaAdresu.getText();
						int telefon = 
								Integer.parseInt(poljeZaTelefon.getText());
						
						Osoba o = new Osoba();
						o.setIme(ime);
						o.setPrezime(prezime);
						o.setAdresa(adresa);
						o.setTelefon(telefon);
						
						osobe.add(o);
						
						obrisiKomponente();
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(
								rootPane, 
								e1.getMessage(), 
								"Greska: " + e1.getClass(),
								JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnNewButton.setBounds(10, 163, 89, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Obrisi");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					obrisiKomponente();
				}
			});
			btnNewButton_1.setBounds(10, 214, 89, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Prikazi sve");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					
					for(Osoba os : osobe)
						textArea.append( os.toString() + '\n' );
					
				}
			});
			btnNewButton_2.setBounds(138, 163, 117, 23);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("Izadji");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnNewButton_3.setBounds(138, 214, 89, 23);
		}
		return btnNewButton_3;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(389, 11, 437, 239);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}

	private void obrisiKomponente() {
		poljeZaIme.setText(null);
		poljeZaPrezime.setText(null);
		poljeZaAdresu.setText(null);
		poljeZaTelefon.setText(null);
		
		textArea.setText(null);
	}
}
