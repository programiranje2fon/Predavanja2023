package dvocas10_utorak.zadatak1;

public class Osoba {
	private String imePrezime;
	private String adresa;
	private int telefon;
	
	public String getImePrezime() {
		return imePrezime;
	}
	
	public void setImePrezime(String imePrezime) {
		if (imePrezime == null || imePrezime.isEmpty()) {
			throw new RuntimeException("Ime i prezime ne sme biti null ili prazan string");
		}
		this.imePrezime = imePrezime;
	}
	
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		if (adresa == null || adresa.isEmpty()) {
			throw new RuntimeException("Adresa ne sme biti null ili prazna");
		}
		this.adresa = adresa;
	}
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		if (telefon<=0) {
			throw new IllegalArgumentException("Telefon ne sme biti negativan ili nula!");
		}
		this.telefon = telefon;
	}

	@Override
	public String toString() {
		return "Osoba [imePrezime=" + imePrezime + ", adresa=" + adresa + ", telefon=" + telefon + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresa == null) ? 0 : adresa.hashCode());
		result = prime * result + ((imePrezime == null) ? 0 : imePrezime.hashCode());
		result = prime * result + telefon;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Osoba))
			return false;
		Osoba other = (Osoba) obj;
		if (adresa == null) {
			if (other.adresa != null)
				return false;
		} else if (!adresa.equals(other.adresa))
			return false;
		if (imePrezime == null) {
			if (other.imePrezime != null)
				return false;
		} else if (!imePrezime.equals(other.imePrezime))
			return false;
		if (telefon != other.telefon)
			return false;
		return true;
	}

	
	
	
	
}
