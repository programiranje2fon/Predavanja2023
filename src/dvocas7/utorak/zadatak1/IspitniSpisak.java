package dvocas7.utorak.zadatak1;

public class IspitniSpisak {
	private String nazivPredmeta;
	
	private Student[] studenti;

		
	public IspitniSpisak(String nazivPredmeta, int brStudenata) {
		setNazivPredmeta(nazivPredmeta);
		if (brStudenata>0) {
			studenti = new Student[brStudenata];
		} else {
			studenti = new Student[100];
		}
		
		/*
		for(int i=0; i<studenti.length; i++) {
			studenti[i] = new Student();
		}
		*/
		
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		if (nazivPredmeta != null && !nazivPredmeta.isEmpty()) {
			this.nazivPredmeta = nazivPredmeta;
		} else {
			System.out.println("GRESKA");
		}
	}
	
	public void ispisi() {
		System.out.println("Naziv predmeta:"+nazivPredmeta);
		
		for(Student student : studenti) {
			System.out.println(student);
		}		
	}
	
	public void dodajStudenta(Student student) {
		if (! daLiPostoji(student)) {
			boolean ubacen = false;
			for(int i=0; i<studenti.length; i++) {
				if (studenti[i] == null) {
					studenti[i] = student;
					ubacen = true;
					break;					
				}
			}
			if (!ubacen) {
				System.out.println("Nema mesta u nizu!");
			}
		} else {
			System.out.println("Student vec postoji u spisku");
		}
	}
	
	public boolean daLiPostoji(Student student) {
		for(int i=0; i<studenti.length; i++) {
			if (student.equals(studenti[i])) {
				return true;
			}
		}
		return false;
	}
	
	public double izracunajProsek() {
		int suma = 0;
		int brStudenata = 0;
		
		for(int i=0; i<studenti.length; i++) {
			if (studenti[i] !=null && studenti[i].getOcena()>5) {
				suma = suma + studenti[i].getOcena();
				brStudenata++;
			}
		}
		return (double)suma / brStudenata;
		
	}
	
	public void pronadjiNajvisuOcenu() {
		int max = -1;
		int maxIdx = -1;
		
		for(int i=0; i<studenti.length; i++) { 
			if (studenti[i]!=null && max < studenti[i].getOcena()) {
				max = studenti[i].getOcena();
				maxIdx = i;
			}
		}
		
		System.out.println("Studnt sa najvisom ocenom:");
		System.out.println(studenti[maxIdx]);
	}
	
	
	public double izracunaProlaznost() {
		int brStudenata=0;
		int polozilo=0;
		
		for(int i=0; i<studenti.length; i++) { 
			if (studenti[i]!=null) {
				brStudenata++;
				if (studenti[i].getOcena()>5) {
					polozilo++;
				}
			}
		}
		
		return (double)polozilo / brStudenata;
		
	}
	
}
