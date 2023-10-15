package dvocas2_utorak.racun;

public class PrimerRacuna2 {

	public static void main(String[] args) {
		Racun mojRacun = new Racun();

		//mojRacun.artikal1 = new Artikal();
		mojRacun.artikal1.naziv = Konzola.ucitajString("Unesite naziv artikla: ");
		mojRacun.artikal1.cena = Konzola.ucitajDecimalniBroj("Unesite cenu: ");
		mojRacun.artikal1.kolicina = Konzola.ucitajCeoBroj("Unesite kolicinu: ");
		
		//mojRacun.artikal2 = new Artikal();
		mojRacun.artikal2.naziv = Konzola.ucitajString("Unesite naziv artikla: ");
		mojRacun.artikal2.cena = Konzola.ucitajDecimalniBroj("Unesite cenu: ");
		mojRacun.artikal2.kolicina = Konzola.ucitajCeoBroj("Unesite kolicinu: ");
		
		mojRacun.ispisi();
		//mojRacun.ukupanIznos = 0;
		
		Racun mojRacun2 = new Racun();
		mojRacun2.artikal1.naziv = Konzola.ucitajString("Unesite naziv artikla: ");
		mojRacun2.artikal1.cena = Konzola.ucitajDecimalniBroj("Unesite cenu: ");
		mojRacun2.artikal1.kolicina = Konzola.ucitajCeoBroj("Unesite kolicinu: ");
		mojRacun2.ispisi();
	}

}
