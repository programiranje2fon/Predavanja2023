package dvocas7_ponedeljak.zadatak1;

import java.util.Objects;

public class Student {
	
	private String ime;
	
	private String prezime;
	
	private String brojIndeksa;
	
	private int ocena;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		if (ime != null && !ime.isEmpty())
				this.ime = ime;
		else
			System.out.println("Greska");
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		if (prezime == null || prezime.isEmpty())
			System.out.println("Greska");
		else
			this.prezime = prezime;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		if (brojIndeksa == null || brojIndeksa.length() != 9)
			System.out.println("Greska");
		else
			this.brojIndeksa = brojIndeksa;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		if (ocena < 5 || ocena > 10)
			System.out.println("Greska");
		else
			this.ocena = ocena;
	}

	@Override
	public String toString() {
		return "Student [ime=" + ime + ", prezime=" + prezime + 
				", brojIndeksa=" + brojIndeksa + ", ocena=" + ocena
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brojIndeksa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (! (obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return Objects.equals(brojIndeksa, other.brojIndeksa);
	}

}
