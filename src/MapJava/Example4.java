package MapJava;

import java.util.*;

public class Example4 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(11, "first");
		map.put(13, "second");
		map.put(15, "third");
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())//comparingByValue()
		.forEach(System.out::println);
	}	
}
