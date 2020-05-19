package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_DuplicateEx {

	public static void main(String[] args) {
	
		//HashSet does not allow duplicate
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("ravi");
		hs.add("biswa");
		hs.add("ramani");
		hs.add("rakesh");
		hs.add("ramani"); // <- this index data is duplicate with index 2
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		hs.remove("ramani");//removing ramani
		
		System.out.println("**********************");
		
		Iterator<String> it1=hs.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
		System.out.println("**********************");
		
		HashSet<String> hs1=new HashSet<String>();
		
		hs1.add("ramani");
		
		hs.addAll(hs1);
		
		Iterator<String> it2=hs.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("**********************");
		
		hs.removeAll(hs1);
		
		Iterator<String> it3=hs.iterator();
		
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		hs.clear();
		

		
	}

}
