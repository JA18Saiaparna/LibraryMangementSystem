package com.exp;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReadingDemo {

	public static void main(String[] args) {
		try
		{
			FileReader fr=new FileReader("input.txt");
			int n=fr.read();
			System.out.println(n);
		}
		catch(FileNotFoundException e )
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
