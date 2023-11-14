package dvocas5_utorak.zadatak1;

import java.util.GregorianCalendar;

public class TestOsoba {

	public static void main(String[] args) {
		Osoba nekaOsoba = new Osoba();
		nekaOsoba.postaviIme("Milan");
		nekaOsoba.postaviPrezime("Peric");
		nekaOsoba.postaviAdresu("Jove Ilica 23");
		nekaOsoba.ispisi();
		
		String adresa = nekaOsoba.uzmiAdresu();
		int duzinaAdrese = adresa.length();
		int prviBlank = adresa.indexOf(' ');
		System.out.println("Prvi blank: "+prviBlank);
		int drugiBlank = adresa.indexOf(' ', prviBlank+1);
		System.out.println("Drugi blank: "+drugiBlank);
		
		String deoAdrese = adresa.substring(prviBlank, drugiBlank);
		System.out.println("Deo adrese: "+deoAdrese);
		
		char drugoSlovoAdrese = adresa.charAt(1);
		System.out.println("Drugo slovo adrese: "+drugoSlovoAdrese);

		System.out.println("Na istoj adresi: " + nekaOsoba.istaAdresa("Jove ilica 23"));
		
		if (adresa.startsWith("Jov")) {
			System.out.println("Adresa pocinje sa Jov!");
		}
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("Ime: ")
		.append(nekaOsoba.uzmiIme())
		.append(" Prezime: ")
		.append(nekaOsoba.uzmiPrezime())
		.append(" Adresa ")
		.append(nekaOsoba.uzmiAdresu());
		
		
		String novaAdresa = sb.toString();
		System.out.println("Nova adresa: "+novaAdresa);
		
		String[] deloviAdrese = adresa.split(" ");
		
		String brojZgrade = deloviAdrese[deloviAdrese.length-1];
		int brZgrade = Integer.parseInt(brojZgrade);
		System.out.println("Broj zgrade: "+brZgrade);
		
		GregorianCalendar datum = new GregorianCalendar(2000, 11, 23);
		nekaOsoba.postaviDatumRodjenja(datum);
		nekaOsoba.ispisi();
		
	}

}
