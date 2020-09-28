//import java.io.*;
//import java.lang.*;
//import java.util.*;


public class Demo {
	
//	public Demo() {
//		// TODO Auto-generated constructor stub
//		System.out.println();
//	}
//	
	public static void main(String args[])
	{
////		int i = 0;
////		Calculator c = new Calculator();
////		int f = c.add(1,1,1,1);
////		System.out.println(f);
////		Student s1 = new Student("Om",10000);
////		s1.printStudent();
		Employee e = new Employee("Om",120.0,100.0);
//		e.printEmployee();
//		
//		Employee e1 = new Employee("Om1",120.0,100.0);
//		e1.printEmployee();
//		
//		
//		System.out.println(Employee.company);
////		System.out.println(Employee.empid);
////		Employee e1 = new Employee();
////		e1.printEmployee();
		
//		ScientificCalculator sc = new ScientificCalculator();
//		System.out.println(sc.fact(5));
//		System.out.println(sc.div(16,4));
		
		
		
		Manager m = new Manager();
		m.printEmployee();
		
		MarketExecutive me = new MarketExecutive(100);
		me.printEmployee();
		
		
	}

}
