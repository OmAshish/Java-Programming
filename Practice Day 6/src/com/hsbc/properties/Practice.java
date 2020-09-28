package com.hsbc.properties;

import java.io.FileReader;
import java.util.Properties;

public class Practice {
	
	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("data.properties");
			Properties props = new Properties();
			props.load(fr);
			
			System.out.println(props.getProperty("name"));
			System.out.println(props.getProperty("state"));
			
			fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
