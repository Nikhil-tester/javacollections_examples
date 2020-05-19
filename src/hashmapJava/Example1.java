package hashmapJava;

import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(11, "first");
		hm.put(12, "second");
		hm.put(13, "third");
		
		System.out.println("Initial list of element"+hm);
		
		//Removes the mapping for the specified key from this map if present.
		hm.remove(11);
		
		System.out.println("Updated list of elements"+hm);
		
		//Removes the entry for the specified key only if it is currently mapped to the specified value.
		hm.remove(12, "second");
		
		System.out.println("Updated list of elements"+hm);
		

	}

}
