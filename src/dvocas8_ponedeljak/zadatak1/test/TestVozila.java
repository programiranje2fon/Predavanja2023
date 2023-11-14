package dvocas8_ponedeljak.zadatak1.test;

import dvocas8_ponedeljak.zadatak1.Automobil;
import dvocas8_ponedeljak.zadatak1.Kamion;
import dvocas8_ponedeljak.zadatak1.Motocikl;
import dvocas8_ponedeljak.zadatak1.MotornoVozilo;

public class TestVozila {

	public static void main(String[] args) {
		//MotornoVozilo mv = new MotornoVozilo();
		
		MotornoVozilo mv1 = new Automobil();
		//Automobil je Ford Focus, snage 70 kilovata,
		//kubikaže 1799 kubika, registarskih oznaka "BG123JK
		mv1.setMarkaModel("Ford Focus");
		mv1.setSnaga(70);
		mv1.setKubikaza(1799);
		mv1.setRegistracija("BG123JK");
		
		MotornoVozilo mv2 = new Motocikl();
		//je Suzuki GS 750, snage 100 kilovata, 
		//749 kubika, registarskih oznaka "NS987TT
		mv2.setMarkaModel("Suzuki GS 750");
		mv2.setSnaga(100);
		mv2.setKubikaza(749);
		mv2.setRegistracija("NS987TT");

		System.out.println(mv1);
		System.out.println( mv1.izracunajRegistraciju() );
		System.out.println(mv2);
		System.out.println( mv2.izracunajRegistraciju() );
		
		MotornoVozilo[] niz = new MotornoVozilo[3];
		
		niz[0] = mv1;
		niz[1] = mv2;
		
		niz[2] = new Kamion();
		niz[2].setSnaga(200);
		niz[2].setKubikaza(3000);
		niz[2].setMarkaModel("TAM");
		niz[2].setRegistracija("SO532OG");
		
		System.out.println(niz[2]);
		System.out.println(niz[2].izracunajRegistraciju());
		
		izracunajUkupnuRegistraciju(niz);
		
	}

	public static void izracunajUkupnuRegistraciju(MotornoVozilo[] vozila) {
		double suma = 0;
		
		for (int i=0; i<vozila.length; i++)
			if (vozila[i]!=null)
				suma = suma + vozila[i].izracunajRegistraciju();


		System.out.println("Ukupna cena registracije za sve je: " + suma);
	}
	
	
}
