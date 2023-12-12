package dvocas9_utorak.zadatak1;

public class Film {
	private String naziv;
	private int trajanje;
	private String reziser;
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		if (naziv == null || naziv.isEmpty()) {
			//throw new RuntimeException("Greska: Naziv ne sme biti null ili prazan!");
			throw new FilmException("Naziv filma ne sme biti null ili prazan!");			
		}
		
		this.naziv = naziv;
	}
	
	
	public int getTrajanje() {
		return trajanje;
	}
	
	public void setTrajanje(int trajanje) throws Exception {
		if (trajanje < 0) {
			throw new Exception("Trajanje ne sme biti negativan broj!");
		}
		this.trajanje = trajanje;
	}
	
	
	public String getReziser() {
		return reziser;
	}
	public void setReziser(String reziser) {
		if (reziser == null || reziser.isEmpty()) {
			throw new IllegalArgumentException("Nedozvo;jena vrednost za rezisera! Ne sme biti null ili prazan string!");
		}
		this.reziser = reziser;
	}
	
	@Override
	public String toString() {
		return "Film [naziv=" + naziv + ", trajanje=" + trajanje + ", reziser=" + reziser + "]";
	}
	
	
	
	
}
