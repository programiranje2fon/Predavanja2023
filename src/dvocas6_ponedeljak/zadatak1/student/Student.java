package dvocas6_ponedeljak.zadatak1.student;

import dvocas6_ponedeljak.zadatak1.osoba.Osoba;

public class Student extends Osoba {
	
	private String fakultet;
	
	private double prosek;
	
	public void postaviFakultet(String fakultet) {
		if (fakultet == null || fakultet.isEmpty())
			System.out.println("GReska");
		else
			this.fakultet = fakultet;
	}
	
	public String vratiFakultet() {
		return fakultet;
	}
	
	public void postaviProsek(double prosek) {
		if (prosek < 6 || prosek > 10)
			System.out.println("Greska");
		else
			this.prosek = prosek;
	}
	
	public double vratiProsek() {
		return prosek;
	}
	
	public String toString() {
		return super.toString() + " "+ fakultet + " " + prosek;
	}

}
