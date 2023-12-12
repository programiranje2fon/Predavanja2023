package dvocas9_utorak.zadatak1;

public class PrimerFilma {

	public static void main(String[] args)  {
		Film omiljeniFilm = new Film();
		try {
			omiljeniFilm.setNaziv("Ajkula 3");
			omiljeniFilm.setTrajanje(-1);
			System.out.println(omiljeniFilm);
		} catch(PogresnoTrajanjeIzuzetak pti) {
			System.out.println(pti.getMessage());
			System.out.println("Molimo unesite ispravno trajanje");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Program i dalje radi");

	}

}
