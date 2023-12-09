package com.java;

import java.util.stream.Stream;

public class StringDemo 
{
   public static void main(String[] args)
   {
	   String string1=new String("Hello world \n Welcome \n  to java");
	   String str1=new String("    hello world        ");
	   Stream<String> stream = str1.lines();
	   stream.filter((line)->{return !line.isBlank();})
	          .map((line)->{return line.stripTrailing();})
	           //.map(String::strip)
	          .forEach(System.out::println);
	      
	   
	  Stream stream2 = Stream.of(string1);
	  stream2.forEach((var s1)->{System.out.println(s1);});
	  
   }
}
