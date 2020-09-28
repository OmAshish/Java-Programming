package com.hsbc.demothreading;

public class Threading extends Thread{
	
	Table t;
	
	public Threading(Table t)
	{
		this.t = t;
	}
	
	public void run() {
		Thread t1 = Thread.currentThread();
		t.print(10);
//		for(int i = 65;i<=90;i++)
//		{
//			System.out.println(t.getName()+" "+(char)i);
//			try
//			{
//				Thread.sleep(1000);
//			}
//			catch(InterruptedException e)
//			{
//				e.printStackTrace();
//			}
//			
//		}
	}

}
