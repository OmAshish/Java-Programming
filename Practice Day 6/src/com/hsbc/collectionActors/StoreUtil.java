package com.hsbc.collectionActors;

import java.util.List;
import java.util.ArrayList;

public class StoreUtil<T> {
	
	List<T> al;
	
	public StoreUtil() {
		// TODO Auto-generated constructor stub
		al = new ArrayList<T>();
	}
	
	public void addRecords(T record){
		al.add(record);
	}
	public List<T> getRecords()
	{
		return this.al;
	}
	
	public int getNumOfRecords()
	{
		return(this.al.size());
	}

}
