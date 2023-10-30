package dvocas6_ponedeljak.zadatak1.osoba;

import java.util.Objects;

public class Osoba {
	
	private String ime = "nepoznato";
	
	private String prezime = "nepoznato";
	
	private String adresa = "nepoznato";

	public void postaviIme(String ime) {
		if (ime == null || ime.isEmpty())
			System.out.println("Greska");
		else
			this.ime = ime;
	}
	
	public void postaviPrezime(String prezime) {
		if (prezime == null || prezime.isEmpty())
			System.out.println("Greska");
		else
			this.prezime = prezime;
	}
	
	public void postaviAdresu(String adresa) {
		if (adresa == null || adresa.length()<5)
			System.out.println("Greska");
		else
			this.adresa = adresa;
	}
	
	public String toString() {
		return ime + " " + prezime + ", " + adresa;
	}
	
	public String vratiPrezime() {
		return prezime;
	}
	
	public String vratiAdresu() {
		return adresa;
	}
	
	public String vratiIme() {
		return ime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ime, prezime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		return Objects.equals(ime, other.ime) && Objects.equals(prezime, other.prezime);
	}
	
	
}
