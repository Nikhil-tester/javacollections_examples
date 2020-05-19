package MapJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * A map contains values on the basis of key, 
 * i.e. key and value pair. Each key and value pair is known as an entry. A Map contains unique keys.
 * A Map is useful if you have to search, update or delete elements on the basis of a key.
 */

/*
 * A Map doesn't allow duplicate keys, but you can have duplicate values. 
 * HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
 */


public class MapConcepts {

	public static void main(String[] args) {

		//non generic
		Map map = new HashMap();
		
		map.put(100, "first");
		map.put(155, "second");
		map.put(190, "fourth");
		
		//Traversing Map 
		Set set =map.entrySet();//Converting to Set so that we can traverse  
		
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry entry =(Map.Entry)it.next();
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
		

	}

}
