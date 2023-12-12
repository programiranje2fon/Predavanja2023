package dvocas11_ponedeljak.zadatak1.test;

import dvocas11_ponedeljak.zadatak1.Blog;
import dvocas11_ponedeljak.zadatak1.BlogPost;

public class TestBlog {
	
	public static void main(String[] args) {
		BlogPost bp = new BlogPost();
		
		bp.setNaslov("Prvi post");
		bp.setSadrzaj("Danas je lep dan.");
		
		System.out.println(bp);
		
		BlogPost bp2 = new BlogPost("tekst.txt");
		
		System.out.println(bp2);
		
		Blog b = new Blog();
		
		b.dodajPost(bp);
		b.dodajPost(bp2);
		
		b.sacuvajBlogTXT("C:\\Users\\student2\\Desktop\\blog.txt");
		b.serijalizujBlog();
	}

}
