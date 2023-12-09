package com.java;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {
	public static void main(String[] args)
	{
	     Path path=Paths.get("abc.txt");
	    		 String data= Files.readString(path);
	    		 Path path2=Paths.get("output.txt");
	    		 Files.writeString(path2,data);
	    		 System.out.println(data);
	}

}
