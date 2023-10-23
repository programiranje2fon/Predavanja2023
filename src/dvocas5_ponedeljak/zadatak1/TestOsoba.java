package dvocas5_ponedeljak.zadatak1;

public class TestOsoba {

	public static void main(String[] args) {
		Osoba o1 = new Osoba();
		
		o1.postaviIme("Pera");
		o1.postaviPrezime("Peric");
		o1.postaviAdresu("Jove Ilica;154;Beograd");
		
		o1.ispisi();
		
		o1.istaAdresa("Vojislava Ilića","154", "Beograd");
	}

}
