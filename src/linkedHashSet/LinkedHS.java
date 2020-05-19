package linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * The important points about Java LinkedHashSet class are:
 * 1. Java LinkedHashSet class contains unique elements only like HashSet.
 * 2. Java LinkedHashSet class provides all optional set operation and permits null elements.
 * 3. Java LinkedHashSet class is non synchronized.
 * 4. Java LinkedHashSet class maintains insertion order.
 */

public class LinkedHS {

	public static void main(String[] args) {
		
		//maintains insertion order.
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("one");
		lhs.add("two");
		lhs.add("three");
		
		Iterator<String> it=lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
