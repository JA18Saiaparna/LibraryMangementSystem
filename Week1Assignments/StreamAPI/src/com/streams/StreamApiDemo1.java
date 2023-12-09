package com.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApiDemo1 {
    public static void main(String args[])
    {
    	Integer arr[]= {1,2,3,4};
    	Stream<Integer>stream1=Arrays.stream(arr);
    	stream1.forEach((element)->{System.out.println(element);});
    	System.out.println("Limit method");
    	Integer arr2[]= {1,2,3,4,6,3,2};
    	Stream<Integer>stream2=Arrays.stream(arr2);
    	stream2.limit(5).forEach(System.out::println);
    	System.out.println("Distinct method");
    	Integer arr3[]= {1,2,3,4,6,3,2,7};
    	Stream<Integer>stream3=Arrays.stream(arr3);
    	stream3.distinct().forEach(System.out::println);
    	
    }
    	
}
