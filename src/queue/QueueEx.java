package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

//Java Queue interface orders the element in FIFO(First In First Out) manner. 
//In FIFO, first element is removed first and last element is removed at last.
//lower the value higher the priority, higher the value lower the priority 

public class QueueEx {

	public static void main(String[] args) {
		
	PriorityQueue<String> pq = new PriorityQueue<String>();
	pq.add("amit");
	pq.add("voda");
	pq.add("ramani");
	pq.add("biswa");
	
	System.out.println("head : "+pq.element());
	
	System.out.println("head : "+pq.peek());
	
	System.out.println("**iterating the queue elements:**");
	
	Iterator<String> it=pq.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}

	pq.remove();//Retrieves and removes the head of this queue. 
				//This method differs from poll only in that it throws an exception if this queue is empty. 
	
	pq.poll();//Retrieves and removes the head of this queue

	System.out.println("after removing two elements:");
	
	Iterator<String> it1=pq.iterator();
	
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	
	
	}

}
