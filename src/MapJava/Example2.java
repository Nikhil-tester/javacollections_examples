package MapJava;

import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		
	Map<Integer, String> map=new HashMap<Integer, String>();
	
	map.put(11, "first");
	map.put(13, "second");
	map.put(15, "third");
	
	map.entrySet()//Returns a Set view of the mappings contained in this map   
	.stream()//Returns a sequential Stream with this collection as its source  
	.sorted(Map.Entry.comparingByKey()) //Sorted according to the provided Comparator  
	.forEach(System.out::println);//Performs an action for each element of this stream  
	}

}
