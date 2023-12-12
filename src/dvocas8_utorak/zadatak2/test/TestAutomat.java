package dvocas8_utorak.zadatak2.test;

import dvocas8_utorak.zadatak2.AutomatZaCokoladice;
import dvocas8_utorak.zadatak2.AutomatZaKafu;
import dvocas8_utorak.zadatak2.MesovitiAutomat;
import dvocas8_utorak.zadatak2.UtopijskiMesovitiAutomat;

public class TestAutomat {

	public static void main(String[] args) {
		MesovitiAutomat mesovitiAutomat = new MesovitiAutomat() ;
		
		AutomatZaCokoladice ac = mesovitiAutomat;
		AutomatZaKafu ak = mesovitiAutomat;
		
		mesovitiAutomat.napraviKafu(50);
		mesovitiAutomat.izbaciCokoladicu(60);
		
		
		ak.napraviKafu(50);
		ac.izbaciCokoladicu(60);		
		
		UtopijskiMesovitiAutomat uma = new UtopijskiMesovitiAutomat();
		
		ak = uma;
		ac= uma;
		
		ak.napraviKafu(50);
		ac.izbaciCokoladicu(60);		
		
		
		

	}

}
