package dvocas7.utorak.zadatak1.test;

import dvocas7.utorak.zadatak1.IspitniSpisak;
import dvocas7.utorak.zadatak1.Student;

public class TestSpiskaStudenata {

	public static void main(String[] args) {
		IspitniSpisak spisak = new IspitniSpisak("Programiranje 1", 8);
		Student student = new Student("Pera", "Peric", "123/2023");
		student.setOcena(9);
		spisak.dodajStudenta(student);
		Student student2 = new Student("Sanja", "Vujic", "243/2023");
		student2.setOcena(10);
		spisak.dodajStudenta(student2);
		Student student3 = new Student("Vanja", "Rajic", "435/2023");
		student3.setOcena(8);
		spisak.dodajStudenta(student3);		
		
		spisak.ispisi();

		Student student4 = new Student("Vanja", "Rajic", "435/2023");
		student.setOcena(5);
		if (student4.equals(student3)) {
			System.out.println("Studenti su isti!");
		}
		
		if (spisak.daLiPostoji(student4)) {
			System.out.println("Uspisku postoji "+student4);
		} else {
			System.out.println("Ne postoji "+student4);
		}
		
		double prosek = spisak.izracunajProsek();
		System.out.println("Prosek:"+prosek);
		spisak.pronadjiNajvisuOcenu();
		
		System.out.println("Prolaznost: " + spisak.izracunaProlaznost());
	}

}
