package dvocas13_utorak.zadatak1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;

import com.google.gson.Gson;

public class BlogPost implements Serializable {
	private static final long serialVersionUID = 6492261824106731951L;

	private String naslov;
	private String sadrzaj="";
	private LocalDate datum;
	
	public BlogPost() {
		
	}
	
	public BlogPost(String naslov, String sadrzaj) {
		this.naslov = naslov;
		this.sadrzaj = sadrzaj;
		this.datum = LocalDate.now();
	}




	public BlogPost(String fajl) {
		try (BufferedReader br = new BufferedReader(new FileReader(fajl))) {
//			BufferedReader br = new BufferedReader(new FileReader(fajl));
			naslov = br.readLine();
			
			while(true) {
				String red = br.readLine();
				if (red == null) {
					break;
				} else {
					sadrzaj = sadrzaj + red + "\n";
				}
			}
			// br.close();
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		datum = LocalDate.now();
		
	}
	
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		if (naslov == null || naslov.isEmpty()) {
			throw new IllegalArgumentException("Naslov ne sme biti prazan!");
		}
		
		this.naslov = naslov;
	}
	public String getSadrzaj() {
		if (sadrzaj == null || sadrzaj.isEmpty()) {
			throw new IllegalArgumentException("Naslov ne sme biti prazan!");
		}		
		
		return sadrzaj;
	}
	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((naslov == null) ? 0 : naslov.hashCode());
		result = prime * result + ((sadrzaj == null) ? 0 : sadrzaj.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BlogPost))
			return false;
		BlogPost other = (BlogPost) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (naslov == null) {
			if (other.naslov != null)
				return false;
		} else if (!naslov.equals(other.naslov))
			return false;
		if (sadrzaj == null) {
			if (other.sadrzaj != null)
				return false;
		} else if (!sadrzaj.equals(other.sadrzaj))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BlogPost [naslov=" + naslov + ", sadrzaj=" + sadrzaj + ", datum=" + datum + "]";
	}
	
	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);		
	}
	
	
	
	
}
