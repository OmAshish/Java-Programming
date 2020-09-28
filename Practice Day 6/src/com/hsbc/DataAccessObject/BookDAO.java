package com.hsbc.DataAccessObject;

import java.util.List;

import com.hsbc.collections.Book;

public interface BookDAO {
	
	public List<Book> getAllBooks();
	
	public Book getBook(Book b);
	
	public void insertBook(Book b);
	
	public void deleteBook(Book b);
	
	public void update(Book b, Book b1);

	public Book getBook(int bookid);

	public void updateBook(Book oldBook, Book updateBook);

}
