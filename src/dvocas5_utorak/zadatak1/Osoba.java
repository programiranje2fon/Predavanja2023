package dvocas5_utorak.zadatak1;

import java.util.GregorianCalendar;


public class Osoba {
	private String ime = "nepoznat";
	private String prezime = new String("nepoznat");
	private String adresa;
	
	private GregorianCalendar datumRodjenja;
	
	
	void postaviIme(String ime) {
		if (ime==null || ime.isEmpty()) {
			System.out.println("GRESKA: ime ne sme biti null ili prazan string!");
		} else {
			this.ime = ime;
		}
	}
	
	String uzmiIme() {
		return ime;
	}
	
	void postaviPrezime(String prezime) {
		if (prezime==null || prezime.isEmpty()) {
			System.out.println("GRESKA: prezime ne sme biti null ili prazan string!");
		} else {
			this.prezime = prezime;
		}
	}
	
	String uzmiPrezime() {
		return prezime;
	}
	
	void postaviAdresu(String adresa) {
		if (adresa==null || adresa.isEmpty() || !adresa.contains(" ") || adresa.length()<5) {
			System.out.println("GRESKA: adresa ne sme biti null ili prazan string, mora sadrzati prazno mesto i najmanje 5 znakova!");
		} else {
			this.adresa = adresa;
		}
	}
	
	String uzmiAdresu() {
		return adresa;
	}	
	
	boolean istaAdresa(String drugaAdresa) {
		// return adresa == drugaAdresa; // ne ovako!
		// return adresa.equals(drugaAdresa);
		//return adresa.toLowerCase().equals(drugaAdresa.toLowerCase());
		return adresa.equalsIgnoreCase(drugaAdresa);
	}
	
	
	void ispisi() {
		System.out.println("Ime: "+ime);
		System.out.println("Prezime: "+prezime);
		System.out.println("Adresa: "+adresa);
		if (datumRodjenja != null) {
			System.out.println("Datum rodjenja: "+datumRodjenja.getTime());
		} else {
			System.out.println("Datum rodjenja nije postavljen!");
		}
	}
	
	void postaviDatumRodjenja(GregorianCalendar datumRodjenja) {
		GregorianCalendar now = new GregorianCalendar();
		if (datumRodjenja == null || datumRodjenja.after(now)) {
			System.out.println("GRESKA");
		} else {
			this.datumRodjenja = datumRodjenja;
		}
	}
	
	
	GregorianCalendar uzmiDatumRodjenja () {
		return datumRodjenja;
	}
	
	
	
	
	
	
	
}
