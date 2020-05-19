package linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

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
		
		Book b1=new Book(11, "name1", "author1", "publisher1", 10);
		Book b2=new Book(12, "name2", "author2", "publisher2", 20);
		Book b3=new Book(13, "name3", "author3", "publisher3", 30);
		
		LinkedHashSet<Book> lhs=new LinkedHashSet<Book>();
		lhs.add(b1);
		lhs.add(b2);
		lhs.add(b3);
		
		Iterator<Book> it=lhs.iterator();
		while(it.hasNext()) {
			Book b=it.next();
			System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", "+b.qtn);
		}	
	}
}
