package dvocas8_utorak.zadatak2;

public class MesovitiAutomat implements AutomatZaKafu, AutomatZaCokoladice {
	private int kolicinaKafe = 100;
	private int brojCokoladica = 35;
	private double kolicinaNovca;
	
	
	
	@Override
	public void izbaciCokoladicu(double iznos) {
		if (iznos<60) {
			System.out.println("Greska: iznos je manji od 60");
		}
		
		if (brojCokoladica ==0) {
			System.out.println("Greska: nema dovoljno cokoladica");
		}
		
		kolicinaNovca += iznos;
		brojCokoladica--;
		
		System.out.println("Izvolite vasu cokoladicu");
		
	}

	@Override
	public void napraviKafu(double iznos) {
		if (iznos<50) {
			System.out.println("Greska: iznos je manji od 50");
		}
		
		if (kolicinaKafe==0) {
			System.out.println("Greska: nema dovoljno kafe");
		}
		
		kolicinaNovca += iznos;
		kolicinaKafe--;
		
		System.out.println("Izvolite vasu kafu");
	}
	
	

}
