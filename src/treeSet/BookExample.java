package treeSet;

//TreeSet example where we are adding books to set and printing all the books
//The elements in TreeSet must be of a Comparable type.
//String and Wrapper classes are Comparable by default
//To add user-defined objects in TreeSet, you need to implement the Comparable interface


import java.util.*;

class Book implements Comparable<Book>{
	int id, qtn;
	String name, author, publisher;
	
	Book(int id, String name, String author, String publisher, int qtn){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.qtn=qtn;
	}
	
	//doubts !!
	public int compareTo(Book b) {
		if(id>b.id) {
			return 1;
		}
		else if (id<b.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

public class BookExample {
	
	public static void main(String[] args) {

	TreeSet<Book> ts=new TreeSet<Book>();
	
	Book b1= new Book(11, "name1", "author1", "publisher1", 11);
	Book b2= new Book(12, "name2", "author2", "publisher2", 110);
	Book b3= new Book(13, "name3", "author3", "publisher3", 1331);
	Book b4= new Book(14, "name4", "author4", "publisher4", 114);
	Book b5= new Book(15, "name5", "author5", "publisher5", 11121);
	
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	ts.add(b5);
	
	for(Book b:ts) {
		System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", "+b.qtn);
	}
	
	System.out.println("*************************");
	
	Iterator<Book> b11=ts.iterator();
	while(b11.hasNext()) {
		Book b=b11.next();
		System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", "+b.qtn);
	  }
	
	System.out.println("*************************");
	Iterator<Book> b111=ts.descendingIterator();
	
	while(b111.hasNext()) {
		Book b=b111.next();
		System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", "+b.qtn);
	  }
	}
}
