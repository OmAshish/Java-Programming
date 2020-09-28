package com.hsbc.learning.test;

public class Test {
	int testid;
	public Test(int testid)
	{
		this.testid = testid;
	}
	
	
	public static void main(String[] args)
	{
//		Test t1 = new Test(1);
//		Test t2 = new Test(34);
		
		Employee e = new Employee(1, "ATUL", 99000);
		Employee e2 = new Employee(2, "AMAN", 99001);
		
		System.out.println(e.equals(e2));
		System.out.println(e);
		System.out.println(e2);
		
//		System.out.println(t1.toString());
//		
//		System.out.println(t1.equals(t2));
//		System.out.println(t1.hashCode());
//		System.out.println(t2.hashCode());
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Test t = (Test) obj;
		if(this.testid == t.testid)
			return true;
		else
			return false;
//		return super.equals(obj);
	}
	
	@Override
	public int hashCode()
	{
		return this.testid;
	}
	
	@Override
	public String toString()
	{
		return "TEST ID : "+this.testid;
	}

}
