package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;



class Book{
	int id, qty;
	String name, author, publisher;
	
	Book(int id, String name, String author, String publisher, int qty){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.qty=qty;
	}
}

public class BookExample {

	public static void main(String[] args) {
	
		Book b1= new Book(11, "Art of Leaving", "H C Varma", "H C Varma", 8);
		Book b2= new Book(12, "Dont Quit", "Tom Harryiesn", "Gupta copier", 12);
		Book b3= new Book(13, "I M possiable", "Rechard", "john copier", 14);
		
		Deque<Book> de= new ArrayDeque<Book>();
		
		de.offer(b1);
		de.offerFirst(b2);
		de.offerLast(b3);
		
		for(Book b:de) {
			System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", "+b.qty);
		}
		
		System.out.println();
		System.out.println();
		
		Iterator<Book>it=de.iterator();
		while(it.hasNext()) {
			Book b=it.next();
			System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", "+b.qty);
		}

	}

}
