package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

//user defind class arraylist

class Emp{
	
	String name, dept;
	int age, salaray;
	
	Emp(String name, String dept, int age, int salaray){
		this.name=name;
		this.dept=dept;
		this.age=age;
		this.salaray=salaray;
		
	}
}

public class ArrayList_EmpExample_1 {

	public static void main(String[] args) {
	
		Emp e1=new Emp("voda", "bi", 27, 15000);
		Emp e2=new Emp("sharadhha", "QA", 24, 55000);
		Emp e3=new Emp("mayank", "CA", 27, 90000);
		
		ArrayList<Emp> ar= new ArrayList<Emp>();
		
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		Iterator<Emp> it1=ar.iterator();
		
		while(it1.hasNext()) {
			Emp empl=it1.next();
			System.out.println(empl.name+" "+empl.age+" "+empl.dept+" "+empl.salaray);
		}

	}

}
