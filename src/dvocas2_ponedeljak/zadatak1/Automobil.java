package dvocas2_ponedeljak.zadatak1;

public class Automobil {
	
	String marka, model, registarskaOznaka;
	int kubikaza;
	double snaga;
	Osoba vlasnik;
	TipGoriva vrstaGoriva;
	
	final double KS_KW = 0.74;
	
	final double KW_KS = 1.34;
	
	Automobil(String ma, String mo, String reg,
			int ku, double sn, Osoba vl, TipGoriva tg){
		marka = ma;
		model = mo;
		registarskaOznaka = reg;
		kubikaza = ku;
		snaga = sn;
		vlasnik = vl;
		vrstaGoriva = tg;
	}
	
	Automobil(String ma, String mo, 
			int ku, double sn, TipGoriva tg){
		marka = ma;
		model = mo;
		kubikaza = ku;
		snaga = sn;
		vrstaGoriva = tg;
	}
	
	Automobil(){
		
	}
	
	
	void ispisi() {
		System.out.println("Marka: " + marka);
		System.out.println("Model: " + model);
		System.out.println("Registracija: " + registarskaOznaka);
		System.out.println("Kubikaza: " + kubikaza);
		System.out.println("Snaga: " + snaga + " kW ("+ snaga*KW_KS + " KS)");
		System.out.print("Vlasnik: ");
		vlasnik.ispisi();
		System.out.println("Vrsta goriva: " + vrstaGoriva);
		
	}
	
	void unesiSnagu(double sn) {// < > <= >=   ==    != 
		if (sn <= 0 || sn >= 800)  
			System.out.println("Snaga je van granica 10-800");
		else 
			snaga = sn;	
	}
	
	void unesiKubikazu(int kubikaza) {
		if (kubikaza < 700 || kubikaza > 5000)
			System.out.println( "Kubikaza je van granica 700-5000");
		else
			this.kubikaza = kubikaza;
	}
	

}
