package dvocas10_utorak.zadatak2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestImenik {

	public static void main(String[] args) {
		Imenik imenik = new Imenik();
		
		Scanner scanner = new Scanner(System.in);
		int izbor=-1;
		while(izbor != 4) {
			System.out.println("IMENIK");
			System.out.println("==========");
			System.out.println("Izaberite opciju:");
			System.out.println("1) Unos");
			System.out.println("2) Pretraga");
			System.out.println("3) Prikaz");
			System.out.println("4) Kraj");
			
			izbor = scanner.nextInt();
			
			switch(izbor) {
				case 1: imenik.ucitajOsobu();
					break;
				case 2: imenik.pronadjiOsobu();
					break;
				case 3: imenik.prikaziOsobe();	
					break;
				case 4: 
					System.out.println("Dovidjenja. Hval sto ste koristili imenik.");
					break;
				default:
					System.out.println("Nepostojeca opcija. Molim unesite opciju 1-4");
			}			
		}

	}

}
