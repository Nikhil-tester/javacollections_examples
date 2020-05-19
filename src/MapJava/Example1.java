package MapJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
	
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(11, "first");
		map.put(13, "second");
		map.put(15, "third");
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("**fetch data through iterator**");
		
		Set set= map.entrySet();
		
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
		
			Map.Entry entry=(Map.Entry)it.next();
			System.out.println(entry.getKey()+", "+entry.getValue());
			
		}

	}

}
