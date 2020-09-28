package com.hsbc.wrappers;

import java.util.StringTokenizer;

public class StringTest {
	 public static void main(String[] args) {
		 
		/*The String Reversal*/
//		String s = new String("Hello world");
//		StringBuilder input1 = new StringBuilder(s); 
//		System.out.println(input1.reverse());
		
		StringBuffer str = new StringBuffer("Hello world");
//		System.out.println(str);
//		System.out.println(str.append("Hi"));

		/**/
//		String s1 = new String("hello world");
//		char c = s1.charAt(0);
//		String st = Character.toUpperCase(c)+s1.substring(1,s1.length());
//		System.out.println(st);
		
//		String s3 = new String("hello world, how are you?");
//		String arr[] = s3.split(" ");
//		for(int x = 0;x<arr.length;x++)
//		{
//			String temp = arr[x].substring(0,1).toUpperCase()+arr[x].substring(1,arr[x].length());
//			System.out.println(temp);
//		}
		
//		int a[] = new int[s3.length()];
//		for(int i = 0;i<s3.length();i++)
//		{
//			a[i] = 0;
//		}
 
		StringTokenizer st = new StringTokenizer(str.toString());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
