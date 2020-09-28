package com.hsbc.demo1;

public class Outer {
	private int a = 12;
	
	static class Inner {
		int a = 99;
		public void show()
		{
			System.out.println(this.a);
//			System.out.println(a);
		}
	}
}
