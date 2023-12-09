package com.exp;

public class xceptionDemo {

	public static void main(String[] args) {
		
      int result = add(4,0);
      System.out.println(result);
      }
    public static int add(int a,int b) throws ArithmeticException
    {
    	return a/b;
    }
}
