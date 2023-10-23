package dvocas5_ponedeljak.zadatak1;

public class Osoba {
	
	String ime = "nepoznato";// char 'A'     String vrednost "sfsdf"
	
	String prezime = "nepoznato";
	
	String adresa;
	
	void postaviIme(String ime) {
		if (ime == null || ime.isEmpty())
			System.out.println("Greska");
		else
			this.ime = ime;		
	}
	
	void postaviPrezime(String prezime) {
		if (prezime != null && prezime.length() > 0)	
			this.prezime = prezime;
		else
			System.out.println("Greska");
	}
	
	void postaviAdresu(String adresa) {
		if (adresa != null && adresa.length() >= 5 &&
				adresa.indexOf(';') != adresa.lastIndexOf(';'))
			this.adresa = adresa;
		else
			System.out.println("Greska");
	}
	
	void istaAdresa(String ulica, String broj, String grad) {
		String adresa2 = ulica + ';'+broj + ';' + grad;
		
		// ulica;broj;grad
		
		if ( adresa.equals(adresa2) ) {
			System.out.println("Ista adresa");
			return;
		}
		
		/*String adresaGrad = adresa.substring( adresa.lastIndexOf(';') + 1);
		
		if ( adresaGrad.equals(grad) )
			System.out.println("Isti grad");*/
		
		if ( adresa.endsWith(';'+grad) ) {
			System.out.println("Isti grad");
			return;
		}
		
		System.out.println("Nije ista adresa");		
	}
	
	void ispisi() {
		System.out.println("Ime: "+ ime);
		System.out.println("Prezime: "+ prezime);

		/*System.out.println("Ulica " +
		    adresa.substring(0, adresa.indexOf(';')));

		System.out.println("Broj " +
			    adresa.substring(adresa.indexOf(';')+1,
			    		adresa.lastIndexOf(';')));

		System.out.println("Grad " +
			    adresa.substring(adresa.lastIndexOf(';')+1));
		 */
		String[] elementiAdrese = adresa.split(";");
		
		System.out.println("Ulica " +  elementiAdrese[0]);

		System.out.println("Broj " +  elementiAdrese[1]);

		System.out.println("Grad " +   elementiAdrese[2]);
	}

}
