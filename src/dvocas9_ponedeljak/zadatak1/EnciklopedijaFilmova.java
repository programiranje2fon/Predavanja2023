package dvocas9_ponedeljak.zadatak1;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class EnciklopedijaFilmova {
	
	private List<Film> filmovi = new ArrayList<Film>();
	
	public void unesiFilm (Film film) {
		if ( filmovi.contains(film) ) 	
			throw new IllegalArgumentException("Film vec postoji");
		
		filmovi.add(film);
	}
	
	public void obrisiFilm(Film film) {
		filmovi.remove(film);
	}
	
	public void ispisi() {
		/*for(int i=0; i<filmovi.size(); i++)
			System.out.println( filmovi.get(i) );*/
		
		for (Film film : filmovi)
			System.out.println( film );
		
		/*Iterator<Film> it = filmovi.iterator();
		
		while (it.hasNext()) {
			Film f = it.next();
			System.out.println( f );
		}*/
	}
	
	public void pronadjiFilm(String deoNaslova) {
		for(Film film : filmovi)
			if ( film.getNaslov().contains(deoNaslova) )
				System.out.println( film );
		
	/*	for(int i=0; i<filmovi.size(); i++) {
			Film f = filmovi.get(i);
			if ( f.getNaslov().contains(deoNaslova) )
			System.out.println( f );
		}*/
	}

}
