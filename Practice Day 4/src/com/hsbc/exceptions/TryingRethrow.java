package com.hsbc.exceptions;

public class TryingRethrow {
	
	public static void main(String[] args) {
		
		try
		{
			show();
		}
		catch (Exception e)
		{
			
			System.out.print("In main catch bolck");
			e.printStackTrace(); 
		}
	}
	
	public static void show() throws Exception
	{
		try
		{
			throw new NullPointerException();
		}
		catch (NullPointerException e)
		{
			System.out.println("I got null value");
			throw new Exception(e);
		}
	}

}
