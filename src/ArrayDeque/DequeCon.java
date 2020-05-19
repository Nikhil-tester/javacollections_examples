package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

//Java Deque Interface is a linear collection that supports 
//element insertion and removal at both ends. Deque is an acronym for "double ended queue". == offerFirst, offerLast

/**
 * The important points about ArrayDeque class are:
 * 1. Unlike Queue, we can add or remove elements from both sides.
 * 2. Null elements are not allowed in the ArrayDeque.
 * 3. ArrayDeque is not thread safe, in the absence of external synchronization.
 * 4. ArrayDeque has no capacity restrictions.
 * 5. ArrayDeque is faster than LinkedList and Stack.
 */

public class DequeCon {

	public static void main(String[] args) {
	
	
		Deque<String> de=new ArrayDeque<String>();
		
		de.add("first");
		de.add("second");
		de.add("third");
		de.add("fourth");
		
		Iterator<String> it=de.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
