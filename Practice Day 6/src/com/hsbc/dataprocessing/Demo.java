package com.hsbc.dataprocessing;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
//	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		al.add(145);
//		al.add(13);
//		al.add(34);
//		
//		Collections.sort(al);
//		
//		Iterator i = al.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		
//		for(int i = 0;i<3;i++)
//		{
//			al.add(i);
//		}
//		System.out.println(al);
		
//		for(int i = 0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
//		
//		System.out.println("Sets");
//		TreeSet set = new TreeSet();
//		set.add(7);
//		set.add(1);
//		set.add(8);
//		set.add(1);
////		set.add("1"); 
////		set.add("17");
//		System.out.println(set);
		
		
		public static void main(String[] args) {
			
			StackArray<Employee> s = new StackArray<Employee>();
			
			Set<String> set1 = new HashSet<String>();
			set1.add("Java");
			set1.add("Python");
			
			Set<String> set2 = new HashSet<String>();
			set2.add("MongoDB");
			set2.add("SQL");
			
			
			ArrayList<Employee> al = new ArrayList<Employee>();
			al.add(new Employee(12,"abc",98,set1));
			al.add(new Employee(13,"aaa",234,set2));
			al.add(new Employee(10,"rty",567,null));
			
			IdCompare id = new IdCompare();
			NameComparator name = new NameComparator();
			
			Collections.sort(al,id);
			System.out.println(al);
		}
	}

//}
