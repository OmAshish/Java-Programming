package com.hsbc.demo1;

public class Demo {
	public static void main(String[] args)
	{
		
		
		
		/*This is for anonymous class!*/
//		MyInterface m1 = new MyInterface() // Anonymous inner class
//		{
//			@Override
//			public int doAction(int a, int b)
//			{
//				return a*b;
//			}
//		};
//		
//		MyInterface m2 = new MyInterface()
//		{
//			@Override
//			public int doAction(int a, int b)
//			{
//				return a+b;
//			}
//		};
//		
//		MyInterface m3 = new MyInterface()
//		{
//			@Override
//			public int doAction(int a, int b)
//			{
//				return a-b;
//			}
//		};
//		
//		MyInterface m4 = new MyInterface()
//		{
//			@Override
//			public int doAction(int a, int b)
//			{
//				return a/b;
//			}
//		};
		
		
		/*Single Line Function*/
		MyInterface m1 = (int a, int b) -> a+b; // Lambda expression, only one abstract method and functional interface
		MyInterface m2 = (int a, int b) -> a*b;
		MyInterface m3 = (int a, int b) -> a-b;
		MyInterface m4 = (int a, int b) -> a/b;
		
		System.out.println(m1.doAction(10, 3));
		System.out.println(m2.doAction(10, 3)); 
		System.out.println(m3.doAction(10, 3));
		System.out.println(m4.doAction(10, 3));
		
		
		/*Calling Static Inner Class of Outer Class*/
//		Outer o = new Outer();
//		Outer.Inner i = new Outer.Inner();
//		i.show();
		
	}
	
	

}
