package linkedHashSet;

import java.util.LinkedHashSet;

public class Example_LHS {

	public static void main(String[] args) {
		
		//ignoring duplicate Elements
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("ramani");
		lhs.add("biswa");
		lhs.add("ramani");//<-duplicate
		lhs.add("nikhil");
		
		for(String st:lhs) {
			System.out.println(st);
		}

	}

}
