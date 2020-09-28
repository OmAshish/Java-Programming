package com.hsbc.exceptions;

public class Demo {
	
	public static void main(String[] args) {
		Demo d = new Demo();
		
		d.divide();
	}
	
	public void divide()
	{
		int a  = 10;
		int b = 2;
		int c = 0;
		String s = null;
		try 
		{
			c = a / b;
			System.out.println(s);
			System.out.println(s.length());
		}
		catch(ArithmeticException t)
		{
			System.out.println(t); // Code to handle logical error
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("String length is 0");
		}
		System.out.println(c);
		
		
		int ar[] = {1,2,4,5,6};
		try
		{
		System.out.println(ar[20]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array length is "+ar.length+" pls try to fetch in the range.....");
		}
		
	}

}
