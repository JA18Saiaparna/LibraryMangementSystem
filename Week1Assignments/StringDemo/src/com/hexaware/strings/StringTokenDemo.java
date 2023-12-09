package com.hexaware.strings;

public class StringTokenDemo {

	public static void main(String[] args) {
		String s1="Hi friends How are you";
		String arr[]=s1.split(" ");
		for(String s:arr)
		{
			System.out.println(s);//for each loop will help us to read data only
		}

	}

}
