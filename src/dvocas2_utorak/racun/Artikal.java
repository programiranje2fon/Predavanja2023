package dvocas2_utorak.racun;

public class Artikal {

	String naziv;
	int kolicina;
	double cena;
	double iznos;
	
	
	double izracunaIznos() {
		iznos = cena * kolicina;
		return iznos;
	}
	
	void ispisi() {
		System.out.println("Naziv artikla: "+naziv );
		System.out.println("Cena: "+cena );
		System.out.println("Kolicina: "+kolicina );		
		System.out.println("Iznos: "+iznos );		
	}
	
}
