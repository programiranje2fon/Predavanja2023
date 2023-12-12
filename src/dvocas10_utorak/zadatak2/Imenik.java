package dvocas10_utorak.zadatak2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dvocas10_utorak.zadatak1.Osoba;

public class Imenik {
	private List<Osoba> osobe = new ArrayList<>();
	
	public void ucitajOsobu() {		
		
		Scanner scanner = new Scanner(System.in);

			Osoba novaOsoba = new Osoba();
			
			System.out.println("Unesite ime i prezime: ");
			String imePrezime = scanner.nextLine();
			novaOsoba.setImePrezime(imePrezime);
			
			System.out.println("Unesite adresu: ");
			String adresa = scanner.nextLine();
			novaOsoba.setAdresa(adresa);
			
			System.out.println("Unesite telefon: ");
			int telefon = scanner.nextInt();			
			novaOsoba.setTelefon(telefon);
			
			if (!osobe.contains(novaOsoba)) {
				osobe.add(novaOsoba);
			} else {
				System.out.println("Osoba se vec nalazi u imeniku!");
			}

		
	}
	
	public void pronadjiOsobu() {		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite deo imena ili prezimena:");			
		String deoImena = scanner.nextLine().toLowerCase();
			
		System.out.println("Rezultati pretrage za: "+deoImena);
			
		for(Osoba osoba : osobe) {
			if (osoba.getImePrezime().toLowerCase().contains(deoImena)) {
				System.out.println(osoba);
			}
		}
						
	}
	
	
	public void prikaziOsobe() {
		for(Osoba osoba : osobe) {
			System.out.println(osoba);
		}
	}
	
	
}
