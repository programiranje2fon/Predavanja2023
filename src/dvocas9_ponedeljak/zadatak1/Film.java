package dvocas9_ponedeljak.zadatak1;

import java.util.Objects;

public class Film {
	
	private String naslov;
	
	private String reziser;
	
	private int godina;

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		if (naslov == null)
			throw new NullPointerException("Naslov ne sme biti null");
		
		if (naslov.isEmpty())
			throw new IllegalArgumentException("Naslov ne sme biti prazan");

		this.naslov = naslov;
	}

	public String getReziser() {
		return reziser;
	}

	public void setReziser(String reziser) throws Exception {
		if (reziser == null || reziser.isEmpty())
			throw new Exception("Reziser ne sme biti null niti prazan String");

		this.reziser = reziser;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		if (godina < 1892)
			throw new IllegalArgumentException("Godina ne sme biti pre 1892");

		this.godina = godina;
	}

	@Override
	public String toString() {
		return "Film [naslov=" + naslov + ", reziser=" + reziser + ", godina=" + godina + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(godina, naslov);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return godina == other.godina && Objects.equals(naslov, other.naslov);
	}	

}
