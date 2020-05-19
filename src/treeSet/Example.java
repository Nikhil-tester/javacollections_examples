package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("amit");
		ts.add("ramani");
		ts.add("biswa");
		ts.add("rakesh");
		ts.add("rakesh");
		
		Iterator<String>it=ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("***Traversing element through Iterator in descending order****");
		
		Iterator<String> it1=ts.descendingIterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
