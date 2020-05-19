package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
	
	Deque<String> de=new ArrayDeque<String>();
	
	de.add("first");
	de.add("second");
	de.add("third");
	de.add("fourth");
	
	System.out.println("***normal flow*****");
	
	Iterator<String>it=de.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	System.out.println("***pull()*****");
	
	de.poll(); //removes the head of this deque, or returns null if this deque is empty.
	
	for(String obj :de) {
		System.out.println("pull() : "+obj);
	}
	
	
	System.out.println("***peek()*****");
	
	de.peek(); //but does not remove, the head of this deque, or returns null if this deque is empty.
	
	for(String obj1 :de) {
		System.out.println("peek() : "+obj1);
	}
	
	System.out.println("***peekFirst()*****");
	
	de.peekFirst();
	
	for(String obj2 :de) {
		System.out.println("peekFirst() : "+obj2);
	}
	
	System.out.println("***peekLast()*****");
	
	de.peekLast();
	
	for(String obj :de) {
		System.out.println("peekLast() : "+obj);
	}
	
	System.out.println("***offerFirst()*****");
	
	de.offerFirst("testFirst"); //It is used to insert the specified element into this deque.
	
	for(String obj :de) {
		System.out.println("offerFirst() : "+obj);
	}
	
	System.out.println("***offerLast()*****");
	
	de.offerLast("testLast"); //It is used to insert the specified element into this deque.
	
	for(String obj :de) {
		System.out.println("offerLast() : "+obj);
	}
	
	System.out.println("***offer()*****");
	
	de.offer("test"); //Inserts the specified element into the queue represented by this deque
	 
	for(String obj :de) {
		System.out.println("offer() : "+obj);
	}
	
	de.pollLast();
	
	for(String obj :de) {
		System.out.println("***************pullLast() : "+obj);
	}
	
	de.getFirst(); //Retrieves, but does not remove, the first element of this deque. 
				//This method differs from peekFirst only in that it throws an exception if this deque is empty.
	
	for(String obj :de) {
		System.out.println("***************getFirst() : "+obj);
	}
	
	
//	de.removeAll(de);
//	
//	for(String obj :de) {
//		System.out.println("***************remove() : "+obj);
//	}
//	
	
	
	

	}

}
