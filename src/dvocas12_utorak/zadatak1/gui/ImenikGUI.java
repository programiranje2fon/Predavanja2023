package dvocas12_utorak.zadatak1.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dvocas12_utorak.zadatak1.osoba.Osoba;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ImenikGUI extends JFrame {

	private JPanel contentPane;
	
	private List<Osoba> osobe = new ArrayList<>();
	private JTextField imeField;
	private JTextField prezimeField;
	private JTextField adresaField;
	private JTextField telefonField;
	
	private JLabel lblIme;
	private JLabel lblPrezime;
	private JLabel lblAdresa;
	private JLabel lblTelefon;
	private JButton btnDodaj;
	private JButton btnObrisi;
	private JButton btnPrikazi;
	private JButton btnIzadji;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextArea textArea;

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
		setTitle("Imenik");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.WEST);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.setBounds(10, 167, 73, 23);
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						String ime = imeField.getText();
						String prezime = prezimeField.getText();
						String adresa = adresaField.getText();
						String telefonStr = telefonField.getText();
						int telefon = Integer.parseInt(telefonStr);
						
						Osoba osoba = new Osoba();
						osoba.setIme(ime);
						osoba.setPrezime(prezime);
						osoba.setAdresa(adresa);
						osoba.setTelefon(telefon);
						
						osobe.add(osoba);
						
						imeField.setText("");
						prezimeField.setText("");
						adresaField.setText("");
						telefonField.setText("");
						
						JOptionPane.showMessageDialog(null, "Kontak uspesno dodat");
					} catch(RuntimeException ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage(), "Greska",JOptionPane.ERROR_MESSAGE);
						//JOptionPane.showMessageDialog(
					}
				}
			});
		}
		return btnDodaj;
	}
	private JTextField getImeField() {
		if (imeField == null) {
			imeField = new JTextField();
			imeField.setBounds(10, 55, 104, 20);
			imeField.setColumns(10);
		}
		return imeField;
	}
	private JLabel getLblIme() {
		if (lblIme == null) {
			lblIme = new JLabel("Ime:");
			lblIme.setBounds(0, 30, 46, 14);
		}
		return lblIme;
	}
	private JLabel getLblPrezime() {
		if (lblPrezime == null) {
			lblPrezime = new JLabel("Prezime:");
			lblPrezime.setBounds(0, 86, 104, 14);
		}
		return lblPrezime;
	}
	private JTextField getPrezimeField() {
		if (prezimeField == null) {
			prezimeField = new JTextField();
			prezimeField.setBounds(10, 111, 100, 20);
			prezimeField.setColumns(10);
		}
		return prezimeField;
	}
	private JTextField getAdresaField() {
		if (adresaField == null) {
			adresaField = new JTextField();
			adresaField.setBounds(145, 55, 86, 20);
			adresaField.setColumns(10);
		}
		return adresaField;
	}
	private JLabel getLblAdresa() {
		if (lblAdresa == null) {
			lblAdresa = new JLabel("Adresa:");
			lblAdresa.setBounds(145, 30, 46, 14);
		}
		return lblAdresa;
	}
	private JLabel getLblTelefon() {
		if (lblTelefon == null) {
			lblTelefon = new JLabel("Telefon:");
			lblTelefon.setBounds(145, 86, 46, 14);
		}
		return lblTelefon;
	}
	private JTextField getTelefonField() {
		if (telefonField == null) {
			telefonField = new JTextField();
			telefonField.setBounds(145, 111, 86, 20);
			telefonField.setColumns(10);
		}
		return telefonField;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.setBounds(93, 167, 86, 23);
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					imeField.setText("");
					prezimeField.setText("");
					adresaField.setText("");
					telefonField.setText("");
					textArea.setText("");
				
				}
			});
		}
		return btnObrisi;
	}
	private JButton getBtnPrikazi() {
		if (btnPrikazi == null) {
			btnPrikazi = new JButton("Prikazi");
			btnPrikazi.setBounds(10, 201, 73, 23);
			btnPrikazi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					for(Osoba osoba : osobe) {
						textArea.append(osoba.toString()+"\n");
					}
				
				}
			});
		}
		return btnPrikazi;
	}
	private JButton getBtnIzadji() {
		if (btnIzadji == null) {
			btnIzadji = new JButton("Izadji");
			btnIzadji.setBounds(93, 201, 86, 23);
			btnIzadji.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return btnIzadji;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(250, 400));
			panel.setLayout(null);
			panel.add(getBtnIzadji());
			panel.add(getBtnPrikazi());
			panel.add(getBtnObrisi());
			panel.add(getBtnDodaj());
			panel.add(getLblPrezime());
			panel.add(getPrezimeField());
			panel.add(getTelefonField());
			panel.add(getLblTelefon());
			panel.add(getLblIme());
			panel.add(getImeField());
			panel.add(getLblAdresa());
			panel.add(getAdresaField());
		}
		return panel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			scrollPane.setViewportView(getTextArea_1());
		}
		return scrollPane;
	}
	private JTextArea getTextArea_1() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
