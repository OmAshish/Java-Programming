package com.hsbc.datasecurity;

import com.hsbc.datasecurity.Person;

public class ClassTOAccessDataInSamePackage extends Person{
	
	public ClassTOAccessDataInSamePackage() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.a);
	}
	
	

}
