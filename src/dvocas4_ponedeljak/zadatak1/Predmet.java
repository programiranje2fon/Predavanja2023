package dvocas4_ponedeljak.zadatak1;

public class Predmet {
	
	String naziv;
	
	int[] ocene;
	
	Predmet (){
		ocene = new int[100];
	}
	
	Predmet (String naziv) {
		this.naziv = naziv;
		ocene = new int[100];		
	}
	
	Predmet (String naziv, int brojStudenata) {
		this.naziv = naziv;

		if (brojStudenata <= 0) {
			System.out.println("Greska");
			ocene = new int[100];
		}
		else {
			ocene = new int[brojStudenata];
		}
	}
	
	void ispisi() {
		System.out.println("Naziv predmeta: " + naziv);
		
		//niz   5   9   8   6   10   10   7
		//index 0   1   2   3    4    5   6
		for (int i=0; i<ocene.length; i++ ) {
			if (ocene[i] != 0)
				System.out.println( ocene[i] );
		}
	}
	
	void unesiOcenu(int ocena) {
		if (ocena < 5 || ocena > 10) {
			System.out.println("Greska, ocena van raspona 5-10");
			return;
		}
		
		//boolean uneto = false;
		
		for(int i=0; i<ocene.length; i++) {
			if (ocene[i] == 0) {
				ocene[i] = ocena;
				return;
				//uneto = true;
				//break;
			}
		}
		
		System.out.println("U nizu nema mesta");
		
		//if (uneto == false)
		//	System.out.println("U nizu nema mesta");
	}
	
	void ispisi2() {
		System.out.println("Naziv predmeta: " + naziv);
		
		//niz   5   9   8   6   10   10   7
		//index 0   1   2   3    4    5   6
		for (int o : ocene) {
			if (o != 0)
				System.out.println( o );
		}
	}
	
	double izracunajProsek() {
		double suma = 0;
		int brojac = 0;
		
		/*for(int i=0; i<ocene.length;i++)
			if (ocene[i] > 5) {
				suma = suma + ocene[i];
				brojac++;
			}*/
		
		for (int ocena: ocene)
			if (ocena > 5) {
				suma = suma + ocena;
				brojac++;
			}
		
		return suma / brojac;
	}
	
	int pronadjiNajvisuOcenu() {
		int max = ocene[0];
		
		for (int i=1;i<ocene.length;i++)
			if (ocene[i] != 0 && ocene[i] > max)
				max = ocene[i];
		
		return max;
	}

	void izracunajProlaznost() {
		int brojPolagao = 0;
		int brojPolozio = 0;
		
		for (int ocena: ocene) {
			if (ocena > 5)
				brojPolozio++;
			
			if (ocena != 0)
				brojPolagao++;
		}
		
		double procenatProlaznosti = (100.0*brojPolozio)/brojPolagao;
		
		System.out.println("Prolaznost: " + procenatProlaznosti + " %");
	}
	
}
