package hashSet;

import java.util.ArrayList;
import java.util.*;

public class Example {

	public static void main(String[] args) {
		// Two Collection
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("ramani");
		ar.add("biswa");
		
		HashSet<String> hs = new HashSet<String>(ar);//adding arraylist on hashset collection
		hs.add("don");
		
		java.util.Iterator<String> it=hs.iterator();
			
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
