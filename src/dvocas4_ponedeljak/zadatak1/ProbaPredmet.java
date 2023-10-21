package dvocas4_ponedeljak.zadatak1;

public class ProbaPredmet {

	public static void main(String[] args) {
		//Predmet p1 = new Predmet("Programiranje 1");
		
		
		//Predmet p2 = new Predmet();
		
		//p2.naziv = "Napredno programiranje";
		
		Predmet2 p3 = new Predmet2("Programiranje 2", 8);
		
		p3.unesiOcenu(5);
		p3.unesiOcenu(6);
		p3.unesiOcenu(8);
		p3.unesiOcenu(10);
		p3.unesiOcenu(9);
		p3.unesiOcenu(10);
		
		p3.ispisi2();
		System.out.println("Prosek: " + p3.izracunajProsek());
		
		System.out.println("Najvisa ocena je: " + p3.pronadjiNajvisuOcenu());
		
		p3.izracunajProlaznost();
	}

}
