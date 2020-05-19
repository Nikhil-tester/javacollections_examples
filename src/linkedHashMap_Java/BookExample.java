package linkedHashMap_Java;

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

		Book b1=new Book(111, "Dont die", "Pablo", "Pabalo copiers", 989);
		Book b2=new Book(112, "Push to death", "Leo Nado De caprio", "Pabalo copiers", 5177);
		Book b3=new Book(112, "lalantop", "nikhil", "nikhil copiers", 57);	
		
		Map<Integer, Book> map=new LinkedHashMap<Integer, Book>();
		
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		
		for(Map.Entry<Integer,Book> entry: map.entrySet()) {
			int key=entry.getKey();
			Book b=entry.getValue();
			System.out.println("Details :"+key);
			System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", "+b.qty);
		}
	}

}
