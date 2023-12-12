package dvocas9_utorak.zadatak1;

public class PrimeriExceptiona {

	public static void main(String[] args) {
		String tekst= null; // "neki tekst";
		int[] niz = {1, 2, 3, 4, 5};
		Film nekiFilm = new Film();
	
		try {
			nekiFilm.setNaziv(null);
			// baca NullPointerException ako je tekst null
			System.out.println("Duzina teksta:"+tekst.length());
			
			// baca ArrayIndexOutOfBoundsException je max index niza 4
			System.out.println(niz[5]);
			
			// baca StringIndexOutOfBoundesException jer tekst ima 10 znakova
			System.out.println("20 karakter u tekstu: "+tekst.charAt(20));
		} catch(NullPointerException npe) { 
			System.out.println("Uhvatili smo NullPointerException!");
		} catch(RuntimeException e) {
			// e.printStackTrace();
			System.out.println("Doslo je do neproveravane greske: "+e.getMessage());
		} catch(Exception e) {
			System.out.println("Uhvatili smo proveravani izuzetak!");
		}

		try {
			nekiFilm.setTrajanje(-120);
			nekiFilm.setNaziv("");			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		
		nekiFilm.setReziser("");
		
		
		System.out.println("Program i dalje radi!");
		
	}

}
