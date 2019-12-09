package com.qsp.mulipletrycatchblock;

public class ExceptionA 
{
	
	public static void main(String[] args) {
		String s=null;
		
	try 
	{
		System.out.println(10/0);
	}
	catch(ArithmeticException e)
	{
	System.out.println("dont do zero");	
	} 
	
	try {
		System.out.println(s.length());
	}
	catch(NullPointerException e) 
	{
		System.out.println("don't deal with null");
	}
	
	
	

	
}
}
