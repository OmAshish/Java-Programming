package com.hsbc.busineeslayer;

public class Calculator {
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	public int add(int n)
	{
		int f = 1;
		for(int i = 2;i<=n;i++)
		{
			f = f*i;
		}
		return f;
	}

}
