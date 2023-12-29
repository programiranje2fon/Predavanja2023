package dvocas13_ponedeljak.zadatak1.poslovna_logika;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dvocas13_ponedeljak.zadatak1.poslovna_logika.utils.LocalDateTimeTypeAdapter;

public class Blog {
	
	private List<BlogPost> postovi = new ArrayList<BlogPost>();
	
	public List<BlogPost> getPostovi() {
		return postovi;
	}

	public void dodajPost(BlogPost post) {
		postovi.add(post);
	}
	
	public void sacuvajBlogTXT(String putanja) {
		try(PrintWriter fajl = 
				new PrintWriter(new FileWriter(putanja))){
			
			for(BlogPost post : postovi)
				fajl.println(post);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void serijalizujBlog(String fajl) {
		try(ObjectOutputStream out =
				new ObjectOutputStream(
						new FileOutputStream(fajl))){
			
			//for(BlogPost post: postovi)
				//out.writeObject(post);
			
			out.writeObject(postovi);
			
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void deserijalizujBlog() {
		try(ObjectInputStream in =
				new ObjectInputStream(
						new FileInputStream("blog.dat"))){
			
			//postovi = (List<BlogPost>) in.readObject();
			
			postovi.clear();
			
			try {
				while(true) {
					BlogPost post = (BlogPost) in.readObject();
					postovi.add(post);
				}
			} catch (Exception e) {
				return;
			}
			
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void sacuvajBlogJSON(String putanja) {
		try(PrintWriter fajl = 
				new PrintWriter(new FileWriter(putanja))){
			
			Gson gson = new GsonBuilder().
					setPrettyPrinting().serializeNulls().registerTypeAdapter(LocalDateTime.class, new LocalDateTimeTypeAdapter()).create();
			
			String json = gson.toJson(postovi);
			
			fajl.print(json);
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
		
		
	}


}
