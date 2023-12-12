package dvocas9_utorak.zadatak2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import dvocas9_utorak.zadatak1.Film;

public class PrimeriLista {

	public static void main(String[] args) {
	//	List<String> lista = new LinkedList<>();
		List<String> lista = new ArrayList<>();
		lista.add("Marko");
		lista.add("Milan");
		lista.add("Jelena");
		lista.add("Sara");

		Collections.sort(lista);
		
		System.out.println(lista);
		
		System.out.println(lista.get(2));
		
		lista.remove("Milan");		
		System.out.println(lista);
		
		if (lista.contains("Sara")) {
			System.out.println("Lista sadrzi ime Sara");
		}
		
		for(String ime : lista) {
			System.out.println(ime);
		}
		
		List<Film> filmovi = new ArrayList<>();
		Film film = new Film();
		film.setNaziv("Spajdermen");
		filmovi.add(film);
		
		System.out.println(filmovi);

	}

}
