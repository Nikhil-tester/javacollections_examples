package list_Interface;

import java.util.ArrayList;
import java.util.List;

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

public class BookList_Example {

	public static void main(String[] args) {
		
		Book b1 = new Book(101, "name1", "author1", "publisher1", 545);
		Book b2 = new Book(102, "name2", "author2", "publisher2", 111);
		Book b3 = new Book(103, "name3", "author3", "publisher3", 522);
		Book b4 = new Book(104, "name4", "author4", "publisher4", 92);
		Book b5 = new Book(105, "name5", "author5", "publisher5", 5);
		Book b6 = new Book(106, "name6", "author6", "publisher6", 982);
		
		List<Book> ll = new ArrayList<Book>();
		ll.add(b1);
		ll.add(b2);
		ll.add(b3);
		ll.add(b4);
		ll.add(b5);
		ll.add(b6);
		
		for(Book b:ll) {
			System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", "+b.qtn);
		}	
	}
}
