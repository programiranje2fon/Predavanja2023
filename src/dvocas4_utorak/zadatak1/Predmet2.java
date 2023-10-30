package dvocas4_utorak.zadatak1;

public class Predmet2 {
	
	String naziv;
	
	int[] ocene;
	
	int brojac = 0;
	
	Predmet2 (){
		ocene = new int[100];
	}
	
	Predmet2 (String naziv) {
		this.naziv = naziv;
		ocene = new int[100];		
	}
	
	Predmet2 (String naziv, int brojStudenata) {
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
		
		for (int i=0; i<brojac; i++ ) 
			System.out.println( ocene[i] );
	}
	
	void unesiOcenu(int ocena) {
		if (ocena < 5 || ocena > 10) {
			System.out.println("Greska, ocena van raspona 5-10");
			return;
		}
		
		if (brojac < ocene.length) {
			ocene[brojac] = ocena;
			brojac++;
		}
		else
			System.out.println("U nizu nema mesta");	
	}
	
	void ispisi2() {
		System.out.println("Naziv predmeta: " + naziv);
		
		//niz   5   9   8   6   10   10   7
		//index 0   1   2   3    4    5   6
		for (int o : ocene) {
			if (o == 0)
				break;
			
			System.out.println( o );
		}		
	}
	
	double izracunajProsek() {
		double suma = 0;
		int brojPolozili = 0;
		
		for(int i=0; i<brojac;i++)
			if (ocene[i] > 5) {
				suma = suma + ocene[i];
				brojPolozili++;
			}
		
		return suma / brojPolozili;
	}
	
	int pronadjiNajvisuOcenu() {
		int max = ocene[0];
		
		for (int i=1;i<brojac;i++)
			if (ocene[i] != 0 && ocene[i] > max)
				max = ocene[i];
		
		return max;
	}

	void izracunajProlaznost() {
		int brojPolozio = 0;
		
		for (int ocena: ocene) {
			if (ocena > 5)
				brojPolozio++;
		}
		
		double procenatProlaznosti = (100.0*brojPolozio)/brojac;
		
		System.out.println("Prolaznost: " + procenatProlaznosti + " %");
	}
	
}
