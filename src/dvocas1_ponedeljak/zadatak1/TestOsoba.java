package dvocas1_ponedeljak.zadatak1;

public class TestOsoba {
	
	public static void main(String[] args) {
		Osoba o1 = new Osoba();
		
		o1.ime = "Lara";
		o1.prezime = "Peric";
		o1.godinaRodjenja = 1990;
		o1.pol = 'Z';
		o1.uBraku = false;
				
		Osoba o2 = new Osoba();
		o2.ime = "Mika";
		o2.prezime = "Mikic";
		o2.pol = 'M';
		o2.godinaRodjenja = 1983;
		o2.uBraku = true;
		
		
		o1.ispisi();
		
		o2.ispisi();
		
		int starost = o2.izracunajStarost(2023);
		
		System.out.println(starost);
		
	}

}
