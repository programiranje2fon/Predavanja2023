package dvocas10_utorak.zadatak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Imenik {
	private List<Osoba> osobe = new ArrayList<>();
	
	public void ucitajOsobu() {		
		try {
			BufferedReader buffReader = 
					new BufferedReader(new InputStreamReader(System.in));			
			
			Osoba novaOsoba = new Osoba();
			
			System.out.println("Unesite ime i prezime: ");
			String imePrezime = buffReader.readLine();
			novaOsoba.setImePrezime(imePrezime);
			
			System.out.println("Unesite adresu: ");
			String adresa = buffReader.readLine();
			novaOsoba.setAdresa(adresa);
			
			System.out.println("Unesite telefon: ");
			String telefon = buffReader.readLine();			
			novaOsoba.setTelefon(Integer.parseInt(telefon));
			
			if (!osobe.contains(novaOsoba)) {
				osobe.add(novaOsoba);
			} else {
				System.out.println("Osoba se vec nalazi u imeniku!");
			}
			
		} catch (IOException e) {
			System.out.println("Greska pri citanju sa uredjaja!");
		} catch(RuntimeException rex) {
			System.out.println("Pogresan unos: "+rex.getMessage());
		}
		
	}
	
	public void pronadjiOsobu() {
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Unesite deo imena ili prezimena:");			
			String deoImena = br.readLine().toLowerCase();
			
			System.out.println("Rezultati pretrage za: "+deoImena);
			
			for(Osoba osoba : osobe) {
				if (osoba.getImePrezime().toLowerCase().contains(deoImena)) {
					System.out.println(osoba);
				}
			}
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void prikaziOsobe() {
		for(Osoba osoba : osobe) {
			System.out.println(osoba);
		}
	}
	
	
}
