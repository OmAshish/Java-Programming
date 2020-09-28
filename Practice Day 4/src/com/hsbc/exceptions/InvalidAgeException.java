package com.hsbc.exceptions;

//import org.omg.CORBA.DynAnyPackage.Invalid;

public class InvalidAgeException extends RuntimeException{
	public InvalidAgeException()
	{
		super("Age range is 18 to 35");
	}

}
