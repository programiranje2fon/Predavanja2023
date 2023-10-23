package dvocas5_ponedeljak.zadatak2;

import java.time.LocalDateTime;

public class FilmskaPremijera {
	
	String naziv;
	
	LocalDateTime premijeraAmerika = LocalDateTime.now();

	LocalDateTime premijeraSvet = LocalDateTime.of(2024, 3, 22, 21, 0);
	
	void postaviNaziv(String naziv) {
		if (naziv == null || naziv.isEmpty())
			System.out.println("Greska");
		else
			this.naziv = naziv;
	}
	
	void postaviDatumePremijera(LocalDateTime premijeraAmerika,
			LocalDateTime premijeraSvet) {
		LocalDateTime sada = LocalDateTime.now();
		
		if (premijeraAmerika.isAfter(sada)  
				&& premijeraSvet.isAfter(sada)) {
			
			this.premijeraAmerika = premijeraAmerika;
			this.premijeraSvet = premijeraSvet;
		}
		else
			System.out.println("Greska");
	}
	
	void pomeriPremijere() {
		premijeraAmerika = premijeraAmerika.plusYears(1);
		premijeraSvet = premijeraSvet.plusYears(1);
	}
	
	void ispisi() {
		System.out.println("Naziv filma: " + naziv);
		System.out.println("Premijera Amerika: " + 
				formatirajDatum(premijeraAmerika) );
		System.out.println("Premijera svet: "  + 
				formatirajDatum(premijeraSvet));
	}
	
	String formatirajDatum(LocalDateTime datum) {
		return datum.getDayOfMonth()+ "."+ 
				datum.getMonthValue() + "." +
				datum.getYear() + ".   " +
				datum.getHour() + ":" + 
				datum.getMinute();
	}
	
}
