package com.hsbc.demoserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.omg.PortableInterceptor.ObjectIdHelper;

public class Employee implements Serializable{
	
	int empid;
	String ename;
	int salary;
	
	public Employee()
	{
		
	}
	
	public Employee(int empid, String ename, int salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	public void doSerialize()
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("abc.data");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(this);
			
			fos.close();
			
			oos.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public Employee doDeserialize()
	{
		Employee e = null;
		
		try
		{
			FileInputStream fis = new FileInputStream("abc.data");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			e = (Employee) ois.readObject();
			
			ois.close();
			
			fis.close();
		}
		catch(FileNotFoundException e1)
		{
			e1.printStackTrace();
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		catch(ClassNotFoundException e1)
		{
			e1.printStackTrace();
		}
		return e;
	}
}
