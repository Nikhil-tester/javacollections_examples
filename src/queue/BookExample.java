package queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class Book implements Comparable<Book>{
	
	int id, qtn;
	String name, auther, publisher;
	
	Book(int id, String name, String auther, String publisher, int qtn){
		
		this.id=id;
		this.name=name;
		this.auther=auther;
		this.publisher=publisher;
		this.qtn=qtn;
	}

	@Override
	public int compareTo(Book b) {
		if(id>b.id) {
			return 1;
		}
		else if(id<b.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}

public class BookExample {

	public static void main(String[] args) {
		
		Book b1= new Book(11, "name1", "auther1", "publisher1", 101);
		Book b2= new Book(12, "name2", "auther2", "publisher2", 122);
		Book b3= new Book(13, "name3", "auther3", "publisher3", 333);
	
		Queue<Book> q=new PriorityQueue<Book>();
		q.add(b1);
		q.add(b2);
		q.add(b3);
		
		for(Book b:q) {
			System.out.println(b.id+", "+b.name+", "+b.auther+", "+b.auther+", "+b.publisher+", "+b.qtn);
		}
		
		q.remove();
		
		System.out.println("****after remove function****");
		
		Iterator<Book>it=q.iterator();
		while(it.hasNext()) {
			Book b=it.next();
			System.out.println(b.id+", "+b.name+", "+b.auther+", "+b.auther+", "+b.publisher+", "+b.qtn);
		}
		
		q.remove();
		
		System.out.println("****after remove function****");
		
		
		Iterator<Book>it1=q.iterator();
		while(it1.hasNext()) {
			Book b=it1.next();
			System.out.println(b.id+", "+b.name+", "+b.auther+", "+b.auther+", "+b.publisher+", "+b.qtn);
		}

	}

}
