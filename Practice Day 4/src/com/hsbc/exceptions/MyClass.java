package com.hsbc.exceptions;

import java.io.*;

public class MyClass {
	
	public static void main(String[] args) {
		MyClass m = new MyClass();
		
		try
		{
			System.out.println(m.scanf());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Its is the finally block!");
		}
	}
	
	public String scanf() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your String: ");
		String s = null;
		
		s = br.readLine();
		
		return s;
	}

}
