package com.hsbc.dataprocessing;

import java.util.ArrayList;

public class StackArray<T> {
	
	ArrayList al = new ArrayList();
	int data;
	
	public void push(T data)
	{
		al.add(data);
	}
	
	public T pop()
	{
		T temp = (T) al.remove(al.size() - 1);
		return temp;
	}
	
	public void display()
	{
		System.out.println(al);
	}
	
//	public void push(T data)
	
	
//	public ArrayList al;
//	
//	public StackArray() {
//		al = new ArrayList();
//		// TODO Auto-generated constructor stub
//	}
//	
//	public void push(int n)
//	{
//		System.out.println("The Element added : "+n);
//		al.add(n);
//	}
//	
//	public void pop()
//	{
////		int g = al.remove(al.get(al.size()));
//		System.out.println ("The Element deleted : "+al.size());
//	}

}
