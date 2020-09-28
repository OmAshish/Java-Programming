package com.hsbc.collectionActors;

import java.util.Comparator;

import com.hsbc.collections.Book;

public class CompareBooksByName implements Comparator<Book> {
	
	@Override
	public int compare(Book b1, Book b2)
	{
		return b1.getName().compareTo(b2.getName());
	}

}
