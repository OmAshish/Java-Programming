package com.hsbc.helloworld;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	
	@Override
	public void init() throws ServletException{
		super.init();
		int n = 9;
		System.out.println("INSIDE INIT METHOD.......");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("SENT DAT USING GET METHOD ..............");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("SENT DAT USING GET METHOD ..............");
	}
	
	@Override
	public void destroy()
	{
		System.out.println("Destroy method called ..........");
	}

}
