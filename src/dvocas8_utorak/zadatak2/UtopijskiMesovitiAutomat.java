package dvocas8_utorak.zadatak2;

public class UtopijskiMesovitiAutomat implements AutomatZaKafu, AutomatZaCokoladice {

	@Override
	public void izbaciCokoladicu(double iznos) {
		System.out.println("Cokoladica je besplatna. Uzmite vasu cokoladicu.");
		
	}

	@Override
	public void napraviKafu(double iznos) {
		System.out.println("Kafa je besplatna. Napravljena je vasa kafa.");
		
	}

	
	
}
