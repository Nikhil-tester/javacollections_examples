package hashmapJava;

import java.util.*;

public class HashMapConcept {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		
		hm.put(11, "first");
		hm.put(12, "second");
		hm.put(13, "third");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+", "+m.getValue());
		}
		
		System.out.println();
		
		hm.putIfAbsent(10, "zero");//If the specified key is not already associated with a value (or is mapped to null) 
		
		for(Map.Entry m1:hm.entrySet()) {
			System.out.println(m1.getKey()+", "+m1.getValue());
		}
		
		System.out.println();
		
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		
		map.put(14, "fourth");
		
		map.putAll(hm);
		
		for(Map.Entry m2: map.entrySet()) {
			System.out.println(m2.getKey()+", "+m2.getValue());
		}
	}

}
