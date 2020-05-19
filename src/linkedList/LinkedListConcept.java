package linkedList;

import java.util.LinkedList;

import java.util.Iterator;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll=new LinkedList<String>();

		System.out.println("Is empty "+ll.isEmpty());
		
		ll.add("test");
		ll.add("automation");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("java");
		
		System.out.println("Is empty "+ll.isEmpty());
		
		
		//print:
		System.out.println("content on linkedlist:"+ll);
		
		//addFirst
		ll.addFirst("nikhil");
		
		//addLast
		ll.addLast("tester");
		System.out.println("content on linkedlist:"+ll);
		
		//Insertion -set & get
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(0, "tom");
		System.out.println(ll.get(0));
		
		//Remove first & last <- manipulating 
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content on linkedlist:"+ll);
		
		ll.remove(2);
		System.out.println("content on linkedlist:"+ll);
		
		//how to print all the values of linkedlist
		//1. for loop
		//2. advance for loop (for each loop)
		//3. iterator
		//4. while loop
		
		System.out.println("*****using for loop*****");
		//for loop
		for(int n=0; n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		//advance for loop (for each loop)
		System.out.println("*****advance for loop (for each loop)*****");
		for(String str:ll) {
			System.out.println(str);
		}
		//iterator
		System.out.println("*****iterator*****");
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*****while*****");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
		
		
		
		
		
		
	}

}






