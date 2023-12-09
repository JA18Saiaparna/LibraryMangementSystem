package com.hexaware.strings;

public class string1 {

	public static void main(String[] args) {
		String name1="sai";
		String name2="sai";
		String name3=new String("sai");
		String name4=new String("sai");
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		System.out.println(name3==name4);
		System.out.println(name3.equals(name4));
		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		String s1="A";
		String s2="B";
		String s3="A";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s3));
		String a1="aparna";
		String a2="APARNA";
		System.out.println(a1.equalsIgnoreCase(a2));
		System.out.println(a1.equals(a2));
		String b1="Sai";
		b1=b1.concat("Aparna");
		System.out.println(b1);
		StringBuffer c1=new StringBuffer("Sai");
		c1.append("Aparna");
		System.out.println(c1);
	}

}
