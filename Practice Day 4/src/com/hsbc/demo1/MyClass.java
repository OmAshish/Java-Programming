package com.hsbc.demo1;

public class MyClass implements MyInterface {
	
	public static void main(String[] args) {
		MyInterface m = new MyClass();
		System.out.println(m.doAction(12, 6));
		
		MyClass m1 = new MyClass();
		System.out.println(m1.doAction(10, 6));
		
		MyClass m2 = new MyClass() // Anonymous inner class -> No one can use it.
		{
			@Override
			public int doAction(int a, int b)
			{
				return a*b;
			}
		};
		System.out.println(m2.doAction(10, 6));
	}
	
	@Override
	public int doAction(int a, int b)
	{
		return a+b;
	}
	
	public void hi()
	{
		System.out.println("Hi");
	}
	
	public void make()
	{
		System.out.println("Made");
	}

}
