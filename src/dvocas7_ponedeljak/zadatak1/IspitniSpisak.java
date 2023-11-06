package dvocas7_ponedeljak.zadatak1;

public class IspitniSpisak {
	
	private String nazivPredmeta;
	
	private Student[] studenti;// new Student()

	public IspitniSpisak(String nazivPredmeta, int brojStudenata) {
		setNazivPredmeta( nazivPredmeta);
		
		if (brojStudenata > 0)
			studenti = new Student[brojStudenata];
		else {
			studenti = new Student[100];
			System.out.println("Greska");
		}
		
	}
	
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		if (nazivPredmeta == null || nazivPredmeta.isEmpty())
			System.out.println("Greska");
		else
			this.nazivPredmeta = nazivPredmeta;
	}
	
	public void ispisi() {
		System.out.println("Naziv predmeta: " + nazivPredmeta);
		
		for(int i=0; i<studenti.length; i++)
			if (studenti[i] != null)
				System.out.println( studenti[i]);
		
		//for (Student s: studenti)
		//	System.out.println( s );
	}
	
	public boolean daLiPostoji(Student s) {
		for(int i=0; i<studenti.length; i++)
			if (studenti[i] != null && studenti[i].equals(s))
				return true;

		return false;
	}
	
	public void unesiStudenta(Student s) {
		if (daLiPostoji(s) == true) {
			System.out.println("Greska");
			return;
		}
		
		for(int i=0; i< studenti.length; i++)
			if (studenti[i] == null) {
				studenti[i] = s;
				return;
			}
		
		System.out.println("Greska");
	}
	
	public double izracunajProsek() {
		double suma = 0;
		int brojStudenata = 0;
		
		for(int i=0; i<studenti.length; i++)
			if (studenti[i] != null && studenti[i].getOcena() > 5) {
				suma = suma + studenti[i].getOcena();
				brojStudenata++;
			}
		
		if(brojStudenata == 0)
			return 0;
		
		return suma / brojStudenata;
	}
	
	public int pronadjiNajvisuOcenu() {
		int max = 0;
		
		/*for(int i=0;i<studenti.length; i++)
			if (studenti[i] != null && studenti[i].getOcena() > max)
				max = studenti[i].getOcena();*/
		
		for (Student s : studenti)
			if (s != null && s.getOcena() > max)
				max = s.getOcena();
		
		return max;
	}
	
	public double izracunajProlaznost() {
		int polagali = 0;
		int polozili = 0;
		
		for (Student s : studenti) 	
			if (s!= null) {
				polagali++;
				
				if (s.getOcena() > 5)
					polozili++;
			}
		
		
		if (polagali == 0)
			return 0;
		
		return (polozili * 100.0) / polagali;
	}
	
	

}
