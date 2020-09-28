package com.hsbc.exceptions;

public class Test {
	
	public static void main(String[] args) {
		int age = 67;
		if(age>18 && age<35)
		{
			System.out.println("Admission successfull!!!!!!!!!!!!!!");
			
		}
		else
		{
			InvalidAgeException i = new InvalidAgeException();
			throw new ArrayIndexOutOfBoundsException("You Are trying to access element!");
//			System.out.println("Not possible");
		}
	}

}
