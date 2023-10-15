package dvocas2_utorak.racun;

public class Racun {

	String nazivFirme;
	
	Artikal artikal1;
	Artikal artikal2;
	Artikal artikal3;	
	
	private double ukupanIznos;	
	private double pdvIznos;	
	
	static int brojRacuna=0;
	
	Racun() {
		brojRacuna++;
		artikal1 = new Artikal();
		artikal2 = new Artikal();
		artikal3 = new Artikal();		
	}
	
		
	void ispisi() {
		izracunaUkupanIznos();	
		izracunajPdvIznos();
		
		System.out.println("-------------------");
		System.out.println("----- RACUN -------");		
		System.out.println("-------------------");
		
		System.out.println("Broj racuna: "+brojRacuna);
		
		for(int i=1; i<=3; i++) {
			if (i==1 && artikal1.naziv != null) {
				artikal1.ispisi();
			}
			
			if (i==2 && artikal2.naziv != null) {
				artikal2.ispisi();				
			}
			
			if (i==3 && artikal3.naziv != null) {
				artikal3.ispisi();				
			}			
		}
		
		System.out.println("----------------");
		System.out.println("Ukupan iznos: " + ukupanIznos);
		System.out.println("PDV iznos: " + pdvIznos);		
	}
	
	void izracunaUkupanIznos() {
		ukupanIznos = 0;
		if (artikal1 != null) {
			ukupanIznos = ukupanIznos + artikal1.izracunaIznos();
		}
		
		if (artikal2 != null) {
			ukupanIznos += artikal2.izracunaIznos();
		}
		
		if (artikal3 != null) {
			ukupanIznos += artikal3.izracunaIznos();
		}					
	}
	
	void izracunajPdvIznos() {
		pdvIznos = ukupanIznos * 0.2;
	}
	
}
