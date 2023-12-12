package dvocas9_utorak.zadatak2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrimerSaListama {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		//lista.add(123);
		lista.add("neki tekst");
		lista.add("marko");
		lista.add("jelica");
		lista.add("jalica");
		lista.add("perica");
		///lista.add(23.86);
		System.out.println(lista);
		
		System.out.println(lista.indexOf("marko"));
		System.out.println("Da li je prazna: "+lista.isEmpty());
		System.out.println("Koliko ima elemenata: "+lista.size());
		System.out.println("Element n apoziciji 3: "+lista.get(3));	
	
		for(String element : lista) {
			System.out.println(element);
		}
		
		if (lista.contains("jelica")) {
			System.out.println("Lista sadrzi string jelica");
		}
		
		Collections.sort(lista);
		
		System.out.println(lista);
	
	}

}
