package com.hsbc.collectionActors;

import java.util.Comparator;

import com.hsbc.collections.Book;

public class CompareBooksByPrice implements Comparator<Book> {
	
	@Override
	public int compare(Book b1, Book b2)
	{
		if(b1.getPrice() > b2.getPrice())
			return 1;
		else if(b1.getPrice() < b2.getPrice())
			return -1;
		else
			return 0;
	}

}