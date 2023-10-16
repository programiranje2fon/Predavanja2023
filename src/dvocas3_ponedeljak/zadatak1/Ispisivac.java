package dvocas3_ponedeljak.zadatak1;

public class Ispisivac {

	static final int MIN_OCENA = 1;

	static final int MAX_OCENA = 5;

	static void ispisiOcenu(int ocena) {
		/*if (ocena < MIN_OCENA || ocena > MAX_OCENA) {
			System.out.println("Greska");
			return;
		}*/

		/*if (ocena == 1)
			System.out.println("Nedovoljan");
		else if (ocena == 2)
			System.out.println("Dovoljan");
		else if (ocena == 3)
			System.out.println("Dobar");
		else if (ocena == 4)
			System.out.println("Vrlo dobar");
		else if (ocena == 5)
			System.out.println("Odlican");
		else
			System.out.println("GRESKA");*/
		
		switch (ocena) {
			case 1: System.out.println("Nedovoljan");break;
			case 2: System.out.println("Dovoljan");break;
			case 3: System.out.println("Dobar");break;
			case 4: System.out.println("Vrlo dobar");break;
			case 5: System.out.println("Odlican");break;
			default: System.out.println("Greska");break;			
		}
	}
	
	static void ispisiZdravo() {
		for(int i = 5; i>=1; i--) {
				System.out.println("Zdravo");
		}	
	}
	
	static void ispisiPoruku(String poruka) {
		ispisiPoruku(poruka, 10);		
	}
	
	static void ispisiPoruku(String poruka, int brojPuta) {
		/*for(int i=1; i<=brojPuta; i++) 
			System.out.println(poruka);	*/
		
		int i=1;
		
		while (i < brojPuta) {
			 System.out.println(poruka);
			 i++;
		 }
	}
	
	static void ispisiBrojeveOd1Do20() {
		System.out.println("START");
		
		for(int i=1; i<=20; i++) {
			
			if (i==15)
				continue;
			
			System.out.println( i );
			
			if (i == 18)
				break;
		}
			
		System.out.println("STOP");
	}
	
	static void vremeDupliranja(double iznos, double kamata) {
		/*double duplo = iznos * 2;
		
		while (iznos < duplo) {
			iznos = iznos * (1+kamata);
			System.out.println(iznos);
		}*/
		
		for(double duplo = iznos * 2; iznos < duplo ;iznos *= (1+kamata) ) {
			System.out.println(iznos);
		}
		
		
	}

}
