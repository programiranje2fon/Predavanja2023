package dvocas2_ponedeljak.zadatak1;

public class TestAutomobil {

	public static void main(String[] args) {
		Osoba o = new Osoba();
		o.ime = "Zika";
		o.prezime = "Zikic";
		o.adresa = "Jove Ilica 154, Beograd";
		o.jmbg = "2352322423414";
		
		Automobil a = new Automobil("Nissan",
				"Micra", "NS-567-HH", 1199, 50.5,
				o, TipGoriva.BENZIN);
		
		a.ispisi();
		
		System.out.println( a.vlasnik.jmbg  );	
	}

}
