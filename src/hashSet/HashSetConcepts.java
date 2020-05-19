package hashSet;

import java.util.HashSet;
import java.util.Iterator;

//Java HashSet class is used to create a 
//collection that uses a hash table for storage. It inherits 
//the AbstractSet class and implements Set interface.

//1. A list can contain duplicate elements whereas Set contains unique elements only.

//** does not follow order of saving the index

public class HashSetConcepts {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<String>();//does follow the order of saving the index
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		hs.add("six");
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
