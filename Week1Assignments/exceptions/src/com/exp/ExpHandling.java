package com.exp;

public class ExpHandling {

	public static void main(String[] args) {
		try
		{
			int result=add(4,0);
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			System.err.println("Exception is  occured Check once");
		}
		catch(NullPointerException e)
		{
			//System.out.println(e);
			System.err.println("Exception occured Check once");
		}
		finally
		{
			System.out.println("Happy Coding!!!!");
		}
		

	}
	public static int add(int a,int b)
	{
		return a/b;
	}

}
