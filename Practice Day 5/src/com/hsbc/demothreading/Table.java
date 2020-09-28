package com.hsbc.demothreading;

public class Table {
	
	public synchronized void print(int t)
	{
		int i = 1;
		for(;i<=10;i++)
		{
			System.out.println(t+" x "+i+" = "+(t*i));
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
