package com.hsbc.collections;

import java.util.Set;

public class Book {
	
	private int id;
	private String name;
	private Set<String> author;
	private double price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name, Set<String> author, double price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<String> getAuthor() {
		return author;
	}

	public void setAuthor(Set<String> author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name "+name+ ", author=" + author + ", price=" + price + "]";
	}

}
