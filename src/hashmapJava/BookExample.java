package hashmapJava;

import java.util.*;

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

		Book b1= new Book(11, "name1", "author1", "publisher1", 121);
		Book b2= new Book(12, "name2", "author2", "publisher2", 3233);
		Book b3= new Book(13, "name3", "author3", "publisher3", 4232);
		Book b4= new Book(14, "name4", "author4", "publisher4", 2323);
		
		Map<Integer,Book> mh= new HashMap<Integer, Book>();
		
		mh.put(1, b1);
		mh.put(2, b2);
		mh.put(3, b3);
		mh.put(4, b4);
		
		for(Map.Entry<Integer, Book> m : mh.entrySet()) {
			
			int key= m.getKey();
			Book b=m.getValue();
			
			System.out.println(key+" Detail:");
			
			System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", "+b.qty);
		}
		
	}

}
