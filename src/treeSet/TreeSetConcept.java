package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {
	
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("N");
		ts.add("I");
		ts.add("K");
		ts.add("H");
		ts.add("I");
		ts.add("L");
		
		Iterator<String>it=ts.descendingIterator();
		
		System.out.println("***descendingIterator***");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("***we perform various NavigableSet operations***");
		
		System.out.println("Initial Set: "+ts);
		
		System.out.println("Revers set: "+ts.descendingSet());
		
		System.out.println("Head set: "+ts.headSet("C", true));//true will contain the index value
		
		System.out.println("Head set -- we perform various SortedSetSet operations.: "+ts.headSet("C"));
		
		System.out.println("Tail set: "+ts.tailSet("C", false));//false will not contain the from index value
		
		System.out.println("tail set -- we perform various SortedSetSet operations."+ts.tailSet("C"));
		
		System.out.println("sub set: "+ts.subSet("C", false, "E", false));
		
		System.out.println("sub set - we perform various SortedSetSet operations."+ts.subSet("C", "E"));
		
		System.out.println("***retrieve and remove the highest and lowest Value***");
		
		TreeSet<Integer> i = new TreeSet<Integer>();
		
		i.add(11);
		i.add(12);
		i.add(22);
		i.add(54);
		
		System.out.println("First Poll : "+i.pollFirst());
		System.out.println("Last Poll : "+i.pollLast());
	}
}
