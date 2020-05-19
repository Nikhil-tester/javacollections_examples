package linkedHashMap_Java;

import java.util.LinkedHashMap;
import java.util.Map;

//LinkedHashMap Example: Key-Value pair

public class Example1 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map= new LinkedHashMap<Integer, String>();
		
		map.put(1, "Amit");
		map.put(2, "mayak");
		map.put(3, "voda");
		map.put(4, "trilok");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+", "+m.getValue());
		}
		
		System.out.println("Fetching key :"+map.keySet());
		
		System.out.println("Fetching value"+map.values());
		
		System.out.println("Fetching key-value pair :"+map.entrySet());
		
		System.out.println("Before invoking remove() method: "+map);
		
		map.remove(3);
		
		System.out.println("After invoking remove() method: "+map);

	}

}
