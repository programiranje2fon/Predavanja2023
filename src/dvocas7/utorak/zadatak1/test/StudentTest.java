package dvocas7.utorak.zadatak1.test;

import dvocas7.utorak.zadatak1.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("Pera", "Peric", "123/2023");
		//Student student3 = new Student(null, null, null);
		Student student2 = new Student();
		student2.setIme("Pera");
		student2.setPrezime("Peric");
		student2.setBrIndeksa("123/2014");
		
		System.out.println(student2);
	}

}
