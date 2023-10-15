package dvocas2_utorak.racun;

public class PrimerRacuna {

	public static void main(String[] args) {
		Racun mojRacun = new Racun();

		String unos = "";
		int brojArtikala=0;
		while(!unos.equals("kraj")) {			
			unos = Konzola.ucitajString("Unesite naziv artikla:");
			brojArtikala++;
			if (!unos.equals("kraj")) {
				Artikal noviArtikal = new Artikal();
				noviArtikal.naziv = unos;
				noviArtikal.cena = Konzola.ucitajDecimalniBroj("Unesite cenu: ");
				noviArtikal.kolicina = Konzola.ucitajCeoBroj("Unesite kolicinu: ");
				
				if (brojArtikala == 1) {
					mojRacun.artikal1 = noviArtikal;
				} else if (brojArtikala == 2) {
					mojRacun.artikal2 = noviArtikal;
				} else {
					mojRacun.artikal3 = noviArtikal;
				}
			}
		}
		
		mojRacun.ispisi();		
		
	}

}
