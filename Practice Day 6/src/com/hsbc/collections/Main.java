package com.hsbc.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.hsbc.collectionActors.CompareBooksByPrice;
import com.hsbc.collectionActors.PrintUtil;
import com.hsbc.collectionActors.SortUtil;
import com.hsbc.collectionActors.StoreUtil;


public class Main {
	
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		set1.add("Java");
		set1.add("Python");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("MongoDB");
		set2.add("SQL");
		
		Set<String> set3 = new HashSet<String>();
		set3.add("C++");
		set3.add("C");
		
		Book b1 = new Book(1, "abc", set1, 234);
		Book b2 = new Book(2, "aerc", set2, 2564);
		Book b3 = new Book(6, "abtyyc", set3, 564);
		Book b4 = new Book(5, "uoc", set1, 982);
		
		
		
		StoreUtil<Book> store = new StoreUtil<Book>();
		store.addRecords(b1);
		store.addRecords(b2);
		store.addRecords(b3);
		store.addRecords(b4);
		
		PrintUtil.printRecords(store.getRecords());
		SortUtil.sortByPrice(store.getRecords());
		PrintUtil.printRecords(store.getRecords());
		SortUtil.sortByName(store.getRecords());
		PrintUtil.printRecords(store.getRecords());
	}

}
