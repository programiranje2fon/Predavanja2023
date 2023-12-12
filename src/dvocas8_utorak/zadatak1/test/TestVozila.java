package dvocas8_utorak.zadatak1.test;

import dvocas8_utorak.zadatak1.Automobil;
import dvocas8_utorak.zadatak1.Motocikl;
import dvocas8_utorak.zadatak1.MotornoVozilo;

public class TestVozila {

	public static void main(String[] args) {
	//	MotornoVozilo mv = new MotornoVozilo(); // ovo ne moze jer je apstraktna klasa
		MotornoVozilo a = new Automobil();
		a.setMarkaModel("Ford Focus");
		a.setSnaga(70);
		a.setKubikaza(1799);
		a.setRegistracija("BG123JK");
		
		MotornoVozilo m = new Motocikl();
		m.setMarkaModel("Suzuki GS 750");
		m.setSnaga(100);
		m.setKubikaza(749);
		m.setRegistracija("NS987TT");

	//	System.out.println(a);
	//	System.out.println(m);
		
		MotornoVozilo[] vozila = new MotornoVozilo[4];
		vozila[0] = a;
		vozila[1] = m;
		
		izracunajUkupnuRegistraciju(vozila);
		
	}

	
	public static void izracunajUkupnuRegistraciju(MotornoVozilo[] vozila) {
		double ukupnaCena = 0;
		
		for(MotornoVozilo m : vozila) {
			if (m != null) {
				double cena = m.izracunajRegistraciju();
				System.out.println("Cena registracije za vozilo "+m+ " Iznos: "+cena);
				ukupnaCena += cena;
			}
		}
		
		System.out.println("Ukupna cena registracije svih vozila: "+ukupnaCena);				
	}
	
	
}
