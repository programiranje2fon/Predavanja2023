package dvocas2_utorak.racun;



import java.util.Scanner;

/**
 * Primer klase sa statickim metodama za ispis na ekran i ucitavanje sa tastature.
 */
public class Konzola {
	
	/**
	 * Ispisuje niz znakova (String) na ekranu.
	 * @param str niz znakova koji treba ispisati
	 */
	public static void ispisi(String str) {
		System.out.println(str);
	}
	
	/**
	 * Ucitava sa tastature niz znakova i vraca ucitani niz znakova kao povratnu vrednost.
	 * Pri tom ispisuje korisniku odgovarajuci poruku koju dobija kao ulazni parametar. 
	 * @param poruka poruka koja se prikazuje korisniku
	 * @return niz znakova ucitan sa tastature.
	 */
	public static String ucitajString(String poruka) {
		System.out.print(poruka);	
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		return str;
	}
	
	public static int ucitajCeoBroj(String poruka) {
		System.out.print(poruka);			
		Scanner scanner = new Scanner(System.in);
		int broj = scanner.nextInt();
		return broj;
	}	
	
	public static double ucitajDecimalniBroj(String poruka) {
		System.out.print(poruka);			
		Scanner scanner = new Scanner(System.in);
		double broj = scanner.nextDouble();
		return broj;
	}	
}
