package dvocas1_utorak.racun;

public class TestRacuna {

	public static void main(String[] args) {
		Racun mojRacun = new Racun(); // kreiranje objekta klase Racun sa new

		// ucitavanje vrednosti i dodeljivanje atributima racuna
		mojRacun.imeArtikla1 = Konzola.ucitajString("Unesite ime prvog artikla :"); // "Plazma keks";
		mojRacun.cena1 = Konzola.ucitajDecimalniBroj("Unesite cenu prvog artikla:");
		mojRacun.kolicina1 = Konzola.ucitajCeoBroj("Unesite kolicinu prvog artikla: ");
	
		mojRacun.imeArtikla2 =Konzola.ucitajString("Unesite ime drugog artikla :");
		mojRacun.cena2 = Konzola.ucitajDecimalniBroj("Unesite cenu drugog artikla:");
		mojRacun.kolicina2 = Konzola.ucitajCeoBroj("Unesite kolicinu drugog artikla: ");
		
		
		/*
		// prikaz racuna 
		System.out.println("Racun: ");
		System.out.println(mojRacun.imeArtikla1 + " Cena: "+mojRacun.cena1 + " Kol: "+mojRacun.kolicina1);
		System.out.println(mojRacun.imeArtikla2 + " Cena: "+mojRacun.cena2 + " Kol: "+mojRacun.kolicina2);
		System.out.println("Iznos:" + mojRacun.izracunajUkupniIznos());
		*/		
		
		// prikaz racuna pomocu metode ispisi
		mojRacun.ispisi();
		
		// kreiranje i prikaz drugog racuna
		Racun mojRacun2 = new Racun();
		mojRacun2.ispisi();		
		
	}

}
