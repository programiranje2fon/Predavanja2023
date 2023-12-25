package dvocas13_ponedeljak.zadatak1.poslovna_logika;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;

public class BlogPost implements Serializable {
	
	private static final long serialVersionUID = -357288576739491874L;

	private String naslov;
	
	private String sadrzaj;
	
	private LocalDateTime datum;
	
	public BlogPost() {
		datum = LocalDateTime.now();
	}
	
	public BlogPost(String putanja) {
		try (BufferedReader br =
				new BufferedReader(
						new FileReader(putanja))){
			
		String naslov = br.readLine();
		
		String sadrzaj = "";
		
		boolean kraj = false;
		while (!kraj) {
			String red = br.readLine();
			
			if (red != null)
				sadrzaj = sadrzaj + red + "\n";
			else
				kraj = true;
		}
		
		setDatum(LocalDateTime.now());
		setNaslov(naslov);
		setSadrzaj(sadrzaj);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		if (naslov == null)
			throw new NullPointerException("Naslov ne sme biti null");
		
		if (naslov.isEmpty())
			throw new IllegalArgumentException("Naslov ne sme biti prazan");

		this.naslov = naslov;
	}

	public String getSadrzaj() {
		return sadrzaj;
	}

	public void setSadrzaj(String sadrzaj) {
		if (sadrzaj == null)
			throw new NullPointerException("Sadrzaj ne sme biti null");
		
		if (sadrzaj.isEmpty())
			throw new IllegalArgumentException("Sadrzaj ne sme biti prazan");

		this.sadrzaj = sadrzaj;
	}

	public LocalDateTime getDatum() {
		return datum;
	}

	public void setDatum(LocalDateTime datum) {
		if (datum == null)
			throw new NullPointerException("Datum ne sme biti null");
		
		this.datum = datum;
	}

	@Override
	public String toString() {
		return datum  + "\n\n" + naslov + "\n\n" + sadrzaj + "\n" ; 
	}
	
	

}
