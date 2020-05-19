package list_Interface;

import java.util.*;



//ListIterator Interface is used to traverse the element in a backward and forward direction.


public class ListIterator {

	public static void main(String[] args) {
	
	List<String> ll= new ArrayList<String>();
	
	ll.add("mohan");
	ll.add("kishan");
	ll.add("ruby");
	ll.add(1, "nikhil");
	
	java.util.ListIterator<String> it=ll.listIterator();
	
	System.out.println("Traversing elements in forward direction");   
	while(it.hasNext()) {
		System.out.println("index: "+it.nextIndex()+" value: "+it.next());
	}
	
	System.out.println("Traversing elements in backward direction");  
	while(it.hasPrevious()) {
		System.out.println("index: "+it.previousIndex()+" value: "+it.previous());
	}
	
	
	}

}











