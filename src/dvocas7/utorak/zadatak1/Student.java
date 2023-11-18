package dvocas7.utorak.zadatak1;

public class Student {
	private String ime;
	private String prezime;
	private String brIndeksa;
	private int ocena;
	
	public Student() {
		
	}
	
	public Student(String ime, String prezime, String brIndeksa) {
		//this.ime = ime;
		//this.prezime = prezime;
		//this.brIndeksa = brIndeksa;
		setIme(ime);
		setPrezime(prezime);
		setBrIndeksa(brIndeksa);
	}

	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		if (ime != null && !ime.equals("")) {
			this.ime = ime;
		} else {
			System.out.println("GRESKA");
		}
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		if (prezime != null && !prezime.isEmpty()) {
			this.prezime = prezime;
		} else {
			System.out.println("GRESKA");
		}
	}
	
	public String getBrIndeksa() {
		return brIndeksa;
	}
	
	public void setBrIndeksa(String brIndeksa) {
		if (brIndeksa !=null &&  !brIndeksa.isEmpty() && brIndeksa.length() <=9) {
			this.brIndeksa = brIndeksa;
		} else {
			System.out.println("GRESKA");
		}
	}
	
	public int getOcena() {
		return ocena;
	}
	
	public void setOcena(int ocena) {
		if (ocena>=5 && ocena <=10) {
			this.ocena = ocena;
		} else {
			System.out.println("GRESKA");
		}
	}

	@Override
	public String toString() {
		return "Student [ime=" + ime + ", prezime=" + prezime + ", brIndeksa=" + brIndeksa + ", ocena=" + ocena + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brIndeksa == null) ? 0 : brIndeksa.hashCode());
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ocena;
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		
		Student other = (Student) obj;
		
		return brIndeksa.equals(other.brIndeksa);			
	}
	
	
	
	
}
