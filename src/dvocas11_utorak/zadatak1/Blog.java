package dvocas11_utorak.zadatak1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Blog {
	private List<BlogPost> postovi = new ArrayList<BlogPost>();
	
	
	public void dodajPost(BlogPost post) {
		postovi.add(post);
	}
	
	public void ispisi() {
		for(BlogPost post : postovi) {
			System.out.println(post);
		}
	}
	
	public void sacuvajUTxtFajl(String imeFajla) {
		try (PrintWriter out  = new PrintWriter(new FileWriter(imeFajla))) {				
			for(BlogPost post : postovi) {
				out.println(post.getNaslov());
				out.println(post.getSadrzaj());
				out.println(post.getDatum());
			}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void serijalizujUFajl(String imeFajla) {
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(imeFajla))) {
			for(BlogPost post : postovi) {
				out.writeObject(post);
			}
			
			//out.writeObject(postovi);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void desirijalizujIzFajla(String imeFajla) {
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(imeFajla));
			
			postovi.clear();
			
			
			while(true) {
				BlogPost post = (BlogPost)inputStream.readObject();
				postovi.add(post);
			}
			
		} catch(EOFException eof) {
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
