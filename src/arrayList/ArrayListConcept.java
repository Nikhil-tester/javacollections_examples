package arrayList;

import java.util.ArrayList;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
	
		
		int arr[]=new int[3];//static array -- size is fixed
		
		//Dynamic array -- ArrayList
		//1. Contain duplicate value/elements
		//2. Maintain insertion order -- index 0,1,2,3....
		//3. Synchronized
		//4. Allow random access to fetch the element because it store the values on the basis of index
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println("Get the value on 2nd index : "+ar.get(2)); //get the value from a index	
		
		System.out.println("Get the count on array list present : "+ar.size()); //size of array
		
		ar.add(40);//3
		ar.add(50);//4
		ar.add(50);//5 <- duplicate
		ar.add(null);//6 <- can take null 
		ar.add("String");//non-generic / not defined data type and allows to store 
		ar.add('a');
		ar.add(true);
		ar.add(10.12);
		
		System.out.println("Get the count on array list present : "+ar.size());
		
		System.out.println(ar.get(6));
		
		ar.set(6, 60); // Manipulating 
		
		System.out.println(ar.get(6));
		
		//to get all value present on array list : for loop (alway array stroe the value on index basis
		
		
		for(int i=0;i<=ar.size();i++) {
			
			System.out.println(ar.get(i));
		
		}
		
		//non-generic vs generic, below is concept to defined the generic.
		
		ArrayList<Integer> arInt = new ArrayList<Integer>();
		
		arInt.add(10);
		//arInt.add("String");//error because its generic and defined as Integer
		
		
		ArrayList<String> arStr = new ArrayList<String>();
		
		arStr.add("String");
		
		ArrayList<Boolean> arBo = new ArrayList<Boolean>();
		
		arBo.add(true);
		
		ArrayList<Double> arDo = new ArrayList<Double>();
		
		arDo.add(12.12);
		
		//when we dont know what data type to be passed under array list that time we'll E <-its add with main method too
		
		ArrayList<E> arE = new ArrayList<E>();
		
		arE.add(10, null);
		arE.add((E) "Staring");
		
			}

}
