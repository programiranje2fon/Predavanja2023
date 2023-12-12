package dvocas10_ponedeljak.zadatak2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dvocas10_ponedeljak.zadatak1.Osoba;

public class Imenik {
	
	private List<Osoba> osobe = new ArrayList<Osoba>();
	
	public void ucitajOsobu() {	
		
			Scanner sc = new Scanner(System.in);
		
			Osoba o = new Osoba();
			
			System.out.print("Unesite ime i prezime: ");
			String imePrezime = sc.nextLine();

			System.out.print("Unesite adresu: ");
			String adresa = sc.nextLine();
			
			System.out.print("Unesite broj telefona: ");
			int telefon = sc.nextInt();

			o.setImePrezime(imePrezime);
			o.setAdresa(adresa);
			o.setTelefon(telefon);

			if (!osobe.contains(o))
				osobe.add(o);
			else
				throw new IllegalArgumentException("Osoba vec postoji u imeniku");
	}
	
	public void pronadjiOsobu() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Unesite deo imena i prezimena za pretragu: ");
			String deoImena = sc.nextLine();
			
			for(Osoba o: osobe)
				if (o.getImePrezime().contains(deoImena))
					System.out.println( o );
	}
	
	public void ispisi() {
		for(Osoba os : osobe)
			System.out.println( os );
	}

}
