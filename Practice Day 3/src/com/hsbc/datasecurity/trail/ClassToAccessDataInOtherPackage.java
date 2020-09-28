package com.hsbc.datasecurity.trail;

import com.hsbc.datasecurity.Person;

public class ClassToAccessDataInOtherPackage extends Person{
	
	Person p = new Person();
	public ClassToAccessDataInOtherPackage myclass = new ClassToAccessDataInOtherPackage();
//	System.out.println(p.a);
	

}
