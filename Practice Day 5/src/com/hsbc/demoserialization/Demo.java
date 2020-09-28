package com.hsbc.demoserialization;

public class Demo {
	
	public static void main(String[] args) {
		Employee e = new Employee(11,"ABC",99000);
		
		e.doSerialize();
		
		Employee e1 = new Employee();
		System.out.println(e1);
		
		e1 = e.doDeserialize();
		System.out.println(e1);
		
	}
}
