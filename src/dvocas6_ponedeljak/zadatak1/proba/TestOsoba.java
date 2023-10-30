package dvocas6_ponedeljak.zadatak1.proba;

import dvocas6_ponedeljak.zadatak1.osoba.Osoba;
import dvocas6_ponedeljak.zadatak1.student.Student;

public class TestOsoba {

	public static void main(String[] args) {
		Osoba o1 = new Osoba();
		
		o1.postaviIme("Pera");
		o1.postaviPrezime("Peric");
		o1.postaviAdresu("Jove Ilica 154, Beograd");
		
		//o1.ispisi();
		
		String ime = o1.vratiIme();
		
		//Nazivi paketa, naziv domena ali obrnuto + naziv projekta
		// ai.fon.bg.ac.rs   biblioteka   Osoba
		
		//rs.ac.bg.fon.ai.biblioteka.Osoba
		//com.lowagie.itext
		
		Student s = new Student();
		
		s.postaviIme("Zika");
		s.postaviPrezime("Zikic");
		s.postaviAdresu("Vojislava Ilica 12 Beograd");
		s.postaviFakultet("Masinski fakultet");
		s.postaviProsek(7.6);
		
		//o1.ispisi();
		//s.ispisi();
		
		System.out.println( o1 );
		System.out.println( s );
		
		
		Osoba o2 = new Student();
		
		o2.postaviIme("Mika");
		o2.postaviPrezime("Mikic");
		o2.postaviAdresu("Deligradska 12, Boeograd");
		
		System.out.println( o2.toString() );
		
		Student s2 = (Student) o2;
		
		s2.postaviFakultet("FON");
		s2.postaviProsek(9.02);
		
		System.out.println( s2);
	}

}
