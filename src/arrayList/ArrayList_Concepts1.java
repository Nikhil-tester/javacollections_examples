package arrayList;

//addAll and removeAll

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Concepts1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> ar1=new ArrayList<String>();
		
		System.out.println("Checking the value present on ar1 array : "+ar1.isEmpty());
		
		ar1.add("tester team");
		ar1.add("selenium");
		ar1.add("qtp");
		
		System.out.println("Checking the value present on ar1 array : "+ar1.isEmpty());
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("dev team");
		ar2.add("java");
		ar2.add("sql dev");
		
		//addAll
		
		ar1.addAll(ar2); //<-addAll merge two ArrayList push the value of other array stored data
		
		//for loop
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		//Iterator 
		
		System.out.println("******************");
		
		//removeAll
		ar1.removeAll(ar2);
		
		Iterator<String> itt=ar1.iterator();
		while(itt.hasNext()) {
			String p2=itt.next();
			System.out.println(p2);
		}
		System.out.println("******************");
		
		for(int i =0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
		System.out.println("**************retainAll*******************");
		
		//retainAll <-Vlookup 
		
		ArrayList<String> ar3= new ArrayList<String>();
		ar3.add("tester team");
		ar3.add("selenium");
		ar3.add("Java");
		
		ArrayList<String> ar4=new ArrayList<String>();
		ar4.add("dev");
		ar4.add("Java");
		ar4.add("tester team");
		
		ar3.retainAll(ar4);
		
		Iterator<String> it2=ar3.iterator();
		while(it2.hasNext()) {
			String S1=it2.next();
			System.out.println(S1);
		}
		
	}
}
