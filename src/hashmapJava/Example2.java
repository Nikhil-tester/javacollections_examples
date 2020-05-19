package hashmapJava;

import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		
		hm.put(111, "Amit");
		hm.put(112, "vivke");
		hm.put(113, "chanda");
		hm.put(114, "bitu");
		hm.put(115, "ruby");
		
		System.out.println("Initial list of element");
		
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+", "+m.getValue());
		}
		
		System.out.println();
		
		System.out.println("updated list of element");
		
		//Replaces the entry for the specified key only if it is currently mapped to some value.
		hm.replace(111, "nikhil");
		
		for(Map.Entry m1: hm.entrySet()) {
			System.out.println(m1.getKey()+", "+m1.getValue());
		}
		
		System.out.println();
		
		System.out.println("updated list of element");
		
		//Replaces the entry for the specified key only if currently mapped to the specified value.
		hm.replace(114, "bitu", "sanjay");
		
		for(Map.Entry m2: hm.entrySet()) {
			System.out.println(m2.getKey()+", "+m2.getValue());
		}
		
		System.out.println();
		
		System.out.println("Updated list of element");
		
		hm.replaceAll((k,v)-> "Nikhil Gupta");
		
		for(Map.Entry m3: hm.entrySet()) {
			System.out.println(m3.getKey()+", "+m3.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
