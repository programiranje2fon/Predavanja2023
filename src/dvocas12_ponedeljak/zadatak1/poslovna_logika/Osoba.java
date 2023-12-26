package dvocas12_ponedeljak.zadatak1.poslovna_logika;

import java.util.Objects;

public class Osoba {
	
	private String ime;
	
	private String prezime;
	
	private String adresa;
	
	private int telefon;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		if (ime == null || ime.isEmpty())
			throw new IllegalArgumentException("Ime ne sme biti null niti prazni");

		this.ime = ime;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		if (adresa == null || adresa.isEmpty())
			throw new IllegalArgumentException("Adresa ne sme biti prazna");
		
		this.adresa = adresa;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		if (telefon < 0)
			throw new IllegalArgumentException("Telefon mora biti veci od nule");

		this.telefon = telefon;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		if (prezime == null || prezime.isEmpty())
			throw new IllegalArgumentException("Prezime ne sme biti null niti prazni");
		
		this.prezime = prezime;
	}

	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", adresa=" + adresa + ", telefon=" + telefon + "]";
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
