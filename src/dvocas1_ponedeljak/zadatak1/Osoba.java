package dvocas1_ponedeljak.zadatak1;

public class Osoba {
	
	String ime; // "Pera"
	
	String prezime;
	
	char pol = 'N'; // 'd'   
	
	int godinaRodjenja; // 1231 55 -34
	
	boolean uBraku; // true false
	
	void ispisi() {
		System.out.println("Ime: "+ime);
		System.out.println("Prezime: "+ prezime);
		System.out.println("Pol: "+ pol);
		System.out.println("Godina rodjenja: "+ godinaRodjenja);
		System.out.println("U braku: " + uBraku);

	}
	
	int izracunajStarost(int trenutnaGodina) {
		return trenutnaGodina - godinaRodjenja;
	}

}
