package dvocas10_ponedeljak.zadatak1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dvocas10_ponedeljak.zadatak1.Imenik;

public class Main {

	public static void main(String[] args) throws IOException {
		Imenik im = new Imenik();

		String opcija;

		do {
			System.out.println();
			System.out.println("_______________________");
			System.out.println();
			System.out.println("Dobrodosli u imenik!!!!");
			System.out.println("_______________________");
			System.out.println("OPCIJE ");
			System.out.println("1 - Unos nove osobe u imenik");
			System.out.println("2 - Pretraga preko dela imena / prezimena");
			System.out.println("3 - Ispis celog imenika");
			System.out.println("4 - Izlaz");
			System.out.println("5 - Ispis celog imenika u JSON formatu");
			System.out.println("________________________");
			System.out.print("Izaberite opciju: ");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			opcija = br.readLine();

			switch (opcija) {
			case "1":
				im.ucitajOsobu();
				break;
			case "2":
				im.pronadjiOsobu();
				break;
			case "3":
				im.ispisi();
				break;
			case "4":break;
			case "5":im.ispisiJSON();break;
			default: System.out.println("MORATE uneti 1, 2, 3, 4 ili 5");
			}

		} while (!opcija.equals("4"));

	}

}
