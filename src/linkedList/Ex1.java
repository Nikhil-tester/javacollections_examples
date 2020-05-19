package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex1 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ajay");
		ll.add("vinod");
		ll.add("kumar");
		
		System.out.println("**reverse order**");
		
		Iterator<String> it=ll.descendingIterator();//Traversing the list of elements in reverse order  
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("**normal order**");

		Iterator<String> it1=ll.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
