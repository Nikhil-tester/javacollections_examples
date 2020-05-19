package list_Interface;

import java.util.ArrayList;
import java.util.List;

//List Interface is the subinterface of Collection. 
//It contains index-based methods to insert and delete elements. It is a factory of ListIterator interface.

public class ListInterface_Concept {

	public static void main(String[] args) {
		
	List<String> ll=new ArrayList<String>();
	
	ll.add("Mohan");
	ll.add("kishan");
	ll.add("ruby");
	
	System.out.println("print the second position array : "+ll.get(2));
	
	for(String a:ll) {
		System.out.println(a);
	}
	}
}
