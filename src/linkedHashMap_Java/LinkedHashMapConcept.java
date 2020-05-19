package linkedHashMap_Java;

import java.util.*;

//Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface, 
//with predictable iteration order. It inherits HashMap class and implements the Map interface.

public class LinkedHashMapConcept {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lh= new LinkedHashMap<Integer, String>();
		
		lh.put(1, "trilok");
		lh.put(2, "ananya");
		lh.put(3, "amrish puri");
		
		for(Map.Entry m: lh.entrySet()) {
			System.out.println(m.getKey()+", "+m.getValue());
		}

	}

}
