package hashSet;

import java.util.*;

class Book{
	int id, qtn;
	String name, author, publisher;
	
	Book(int id, String name, String author, String publisher, int qtn){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.qtn=qtn;
	}
}

public class Book_Example {

	public static void main(String[] args) {

		Book b1=new Book(111, "Dont die", "Pablo", "Pabalo copiers", 989);
		Book b2=new Book(112, "Push to death", "Leo Nado De caprio", "Pabalo copiers", 5177);
		Book b3=new Book(112, "Lanl lantop", "nikhil", "nikhil copiers", 57);	
		
		HashSet<Book> hs=new HashSet<Book>();
		
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		
		Iterator<Book> it=hs.iterator();
		
		while(it.hasNext()) {
			Book n = it.next();
			System.out.println(n.id+", "+n.name+", "+n.author+", "+n.publisher+", "+n.qtn);
		}
	}
}
