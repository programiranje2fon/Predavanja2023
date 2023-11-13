package dvocas8_ponedeljak.zadatak2;

public class MesovitiAutomat implements AutomatZaKafu, AutomatZaCokoladice {

	private int kolicinaKafe = 100;
	
	private int brojCokoladica = 35;
	
	private int kolicinaNovca = 0;
	
	@Override
	public void izbaciCokoladicu(int novac) {
		if (novac >= 60 && brojCokoladica > 0) {
			kolicinaNovca = kolicinaNovca + novac;
			brojCokoladica--;
			System.out.println("Cokoladica je izbacena");
		}
		else
			System.out.println("Greska");
		
	}

	@Override
	public void napraviKafu(int novac) {
		if (novac >= 50 && kolicinaKafe > 0) {
			kolicinaNovca = kolicinaNovca + novac;
			kolicinaKafe--;
			System.out.println("Kafa je napravljena");
		}
		else
			System.out.println("Greska");
	}

}
