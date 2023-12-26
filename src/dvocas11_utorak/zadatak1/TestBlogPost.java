package dvocas11_utorak.zadatak1;

import java.time.LocalDate;

public class TestBlogPost {

	public static void main(String[] args) {
		BlogPost post = new BlogPost("blog_post.txt");
//		post.setNaslov("Programiranje 1 - Rad sa fajlovima");
//		post.setSadrzaj("Ovaj blog post opisuje rad sa strimovima....");
		
		BlogPost post2 = new BlogPost("blog_post2.txt");
		
		Blog blog = new Blog();
	//	blog.dodajPost(post);
	//	blog.dodajPost(post2);
		
//		System.out.println(post);
		//blog.ispisi();
		//blog.sacuvajUTxtFajl("ceoBlox.txt");
		
	//	blog.serijalizujUFajl("blog.dat");
		blog.desirijalizujIzFajla("blog.dat");
		blog.ispisi();
		
		

	}

}
