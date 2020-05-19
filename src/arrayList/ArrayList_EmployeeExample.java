package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	
	String name;
	int age;
	String dept;
	
	Employee(String name, int age, String dept){
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
}

public class ArrayList_EmployeeExample {

	
	public static void main(String[] args) {
		
		//Employee class object
		Employee e1 = new Employee("Amit", 27, "QA");
		Employee e2 = new Employee("voda", 28, "BI");
		Employee e3 = new Employee("Raheja", 32, "Admin");
		
		//create array list
		ArrayList<Employee> Ex = new ArrayList<Employee>();
		
		Ex.add(e1);
		Ex.add(e2);
		Ex.add(e3);		
		
		//iterator to traverse the value
		Iterator<Employee> it = Ex.iterator();
			
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
		}
	}
}
