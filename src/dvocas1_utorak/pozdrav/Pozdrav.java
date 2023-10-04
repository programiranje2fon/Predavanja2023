package dvocas1_utorak.pozdrav;

/**
 * Primer Java programa:
 * 	Definicija klase i main metode 
 * 	Ispisivanje na ekranu
 * 	Osnovni Java tipovi
 *  Nadovezivanje nizova znakova (stringova)
 */
public class Pozdrav {

	// izvrsavanje programa pocinje od main metode koaj mora biti tacno ovako definisana
	public static void main(String[] args) { // svaki java program pocinje izvrsavanje od main metode
		
		// ispisivanje poruke na ekranu - iza // se pise komentar u jednoj liniji
		System.out.println("Zdravo iz Java-e!");
		
		// deklaracija promenljivih: <tip> <nazivPromenljive> = <pocetna vrednost>; 
		int ceoBroj = 100; // int je tip za cele brojeve
		System.out.println(ceoBroj);	// ispisi promenljivu koja je ceo broj
		double decimalniBroj = 12.456; // double je tip za decimalne brojeve
		boolean logickaPromenljiva = true; // boolean je logicki tip tacno/netacno		 
		char znak = 'a'; // znakovni tip - slova, interpunkcijski znaci, itd.
		
		String poruka = "Evo nekoliko brojeva:"; // String je niz znakova i u Javi je klasa
		
		System.out.println(poruka); // ispisi tekst / String promenljivu
		System.out.println("Ceo broj: "+ceoBroj+ " Decimalni broj: "+decimalniBroj);
	}
	
}
