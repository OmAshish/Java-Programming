package com.hsbc.dataprocessing;

import java.util.HashMap;

public class WordCount {
	public static void main(String[] args) {
		String s = "Hello world how are you and I am fine! how about you ?";
		String arr[] = s.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String temp: arr)
		{
			map.merge(temp, 1, WordCount::add);
		}
		
		System.out.println(map);
	}
	
	static int add(Integer a, Integer b)
	{
		return a+b;
	}

}
