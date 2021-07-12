package com.collections;

public class ExceptionDemo {

	
	static String str;//instance variable default value is :null
	public static void main(String[] args)
	{
	try
	{
	System.out.println(10/0);
	}
	catch (ArithmeticException ae)
	{
	System.out.println("we are getting ArithematicException"+ae);
	}
	try
	{
	System.out.println(str.length());
	}
	catch (NullPointerException ne)
	{
	System.out.println("we are getting nullpointerException"+ne);
	}
	System.out.println("if we provide try-catch");
	System.out.println("the rest of the code is executed");
	}

}

