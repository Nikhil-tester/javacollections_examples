package linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatePar {

	public static void main(String[] args) {
		
		String string = "aabbccdefatafaz";
		
		char[] chars = string.toCharArray();
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}
		
		
		

	}

}
