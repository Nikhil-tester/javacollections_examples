package arrayList_linkedList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

/*
 *ArrayList--
 *
 *1) ArrayList internally uses a dynamic array to store the elements.
 *2) Manipulation with ArrayList is slow because it internally uses an array. 
 *If any element is removed from the array, all the bits are shifted in memory. 
 *3) An ArrayList class can act as a list only because it implements List only.
 *4) ArrayList is better for storing and accessing data.
 */

/**
 * LinkedList--
 * 
 * 1) LinkedList internally uses a doubly linked list to store the elements.
 * 2) Manipulation with LinkedList is faster than ArrayList because it uses 
 * a doubly linked list, so no bit shifting is required in memory.
 * 3) LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
 * 4) LinkedList is better for manipulating data.
 *
 */

public class ArrayList_LinkedList {

	public static void main(String[] args) {
	
		ArrayList<String> aa= new ArrayList<String>();
		
		aa.add("Book");
		aa.add("pen");
		aa.add("table");
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("class room");
		ll.add("student");
		ll.add("teacher");
		
		System.out.println("**ArrayList**");
		for(String a:aa) {
			System.out.println(a);
		}
		
		System.out.println("**LinkedList**");
		for(String b:ll) {
			System.out.println(b);
		}
		
		
		
		

	}

}
