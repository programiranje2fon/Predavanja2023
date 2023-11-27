package dvocas9_ponedeljak.zadatak1.test;

import dvocas9_ponedeljak.zadatak1.EnciklopedijaFilmova;
import dvocas9_ponedeljak.zadatak1.Film;

public class TestFilm {

	public static void main(String[] args) {
		Film f = new Film();
		
		f.setNaslov("Blade runner 2047");
		
		try {
			f.setReziser("Denis Villeneuve");
		} catch (Exception e1) {}
		
		f.setGodina(2017);
				
		try {
			System.out.println( f.getNaslov().length() );

			//System.out.println( f.getNaslov().charAt(24));
		}catch(Exception e) {
			System.out.println( e.getMessage() );
			e.printStackTrace();
		}
		
		
		System.out.println("KRAJ");
		
		EnciklopedijaFilmova ef = new EnciklopedijaFilmova();
		
		ef.unesiFilm(f);
		
		Film f2 = new Film();
		f2.setGodina(1982);
		f2.setNaslov("Blad runner");
		try {
			f2.setReziser("Ridley Scott");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ef.unesiFilm(f2);
		
		ef.ispisi();
		
		System.out.println("-------------------");
		ef.pronadjiFilm("2047");
	}

}
