package com.hsbc.dataprocessing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class TestingMap {
	
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(11, "ABC");
		m.put(2, "xyz");
		m.put(5,"sed");
		m.put(4,"sfr");
		m.put(2, "ABC");
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(45);
		al.add(15);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("mil");
		al2.add("jab");
		al2.add("hum");
		
		m.put("id",al);
		m.put("name",al2);
		
		System.out.println(m);
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(12, "Hi");
		map.put(8, "bye");
		map.put(1, "Hi");
		map.put(98, "bye");
		
		System.out.println(map);
	}

}
