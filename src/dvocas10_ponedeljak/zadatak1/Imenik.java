package dvocas10_ponedeljak.zadatak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Imenik {
	
	private List<Osoba> osobe = new ArrayList<Osoba>();
	
	public void ucitajOsobu() {	
		try {
			Osoba o = new Osoba();
			
			BufferedReader br = 
					new BufferedReader (
							new InputStreamReader(
									System.in));
			System.out.print("Unesite ime i prezime: ");
			String imePrezime = br.readLine();

			System.out.print("Unesite adresu: ");
			String adresa = br.readLine();
			
			System.out.print("Unesite broj telefona: ");
			int telefon = Integer.parseInt( br.readLine() );

			o.setImePrezime(imePrezime);
			o.setAdresa(adresa);
			o.setTelefon(telefon);

			if (!osobe.contains(o))
				osobe.add(o);
			else
				throw new IllegalArgumentException("Osoba vec postoji u imeniku");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void pronadjiOsobu() {
		try {
			BufferedReader br = 
					new BufferedReader(
							new InputStreamReader(System.in));
			
			System.out.print("Unesite deo imena i prezimena za pretragu: ");
			String deoImena = br.readLine();
			
			for(Osoba o: osobe)
				if (o.getImePrezime().contains(deoImena))
					System.out.println( o );
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void ispisi() {
		for(Osoba os : osobe)
			System.out.println( os );
	}
	
	public void ispisiJSON() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		System.out.println( gson.toJson(osobe) );
		
	}

}
