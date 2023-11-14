package dvocas8_ponedeljak.zadatak2.test;

import dvocas8_ponedeljak.zadatak2.*;

public class TestAutomat {

	public static void main(String[] args) {
		//AutomatZaKafu ak = new AutomatZaKafu();

		MesovitiAutomat ma = new MesovitiAutomat();
		
		ma.napraviKafu(50);
		ma.izbaciCokoladicu(40);
		
		AutomatZaCokoladice ak = new UtopijskiMesovitiAutomat();
		
		ak.izbaciCokoladicu(60);
		//ak.napraviKafu(60);
	}

}
