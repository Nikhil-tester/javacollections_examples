package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

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

public class BookExample {

	public static void main(String[] args) {

		Book b1=new Book(11, "Book1", "author1", "publisher1", 120);
		Book b2=new Book(12, "Book2", "author2", "publisher2", 320);
		Book b3=new Book(13, "Book3", "author3", "publisher3", 410);
		Book b4=new Book(14, "Book4", "author4", "publisher4", 550);
		
		
		LinkedList<Book> ll=new LinkedList<Book>();
		
		ll.add(b1);
		ll.add(b2);
		ll.add(b3);
		ll.add(b4);
		
		Iterator<Book> it=ll.iterator();
		
		while(it.hasNext()) {
			Book n = it.next();
			System.out.println(n.id+", "+n.name+", "+n.author+", "+n.publisher+", "+n.qtn);	
		}
		
		System.out.println("**");
		for(Book ar:ll) {
			System.out.println(ar.id+", "+ar.name+", "+ar.author+", "+ar.publisher+", "+ar.qtn);
		}
		
		
		
		
		
	
	}

}
