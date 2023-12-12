package dvocas11_ponedeljak.zadatak1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
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
	
	public void sacuvajBlogTXT(String putanja) {
		try(PrintWriter fajl = 
				new PrintWriter(new FileWriter(putanja))){
			
			for(BlogPost post : postovi)
				fajl.println(post);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void serijalizujBlog() {
		try(ObjectOutputStream out =
				new ObjectOutputStream(
						new FileOutputStream("blog.dat"))){
			
			//for(BlogPost post: postovi)
				//out.writeObject(post);
			
			out.writeObject(postovi);
			
		}catch(Exception e) {
			e.printStackTrace();
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
			e.printStackTrace();
		}
	}

}
