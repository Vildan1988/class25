package com.class15;

public class StringManipulations {
public static void main(String[] args) {
// String class comes in java long package
	
	//2 ways to create a string 
	
	//first way using String literal
	String str="Hello";
	
	//second way using new keyword-creating a String object
	String str1=new String ("hello");
	
	System.out.println(str);
	System.out.println(str1);
	
//inside String class we many many methods that can be 
//performed on String
	
	//1) find the number of character inside the String
		//.length();
	int length=str.length();
	System.out.println(length);
	
	//2) case conversion 
		//toLowerCase();
		//toUpperCase();
	
	//str=str.toLowerCase(); dersek alttakini yazmaya gerek olmaz
	System.out.println(str.toLowerCase());//hello
	System.out.println(str);//Hello
	
	str=str.toLowerCase().toUpperCase();
	System.out.println(str);
	
	//verify if there if the string is empty
	
	String myString="";//empty value
	boolean isEmpty=myString.isEmpty();
	System.out.println(isEmpty);
	
String myString1=null;//no value at all it is equal to String myString1;
//System.out.println(myString1.isEmpty());

	//how to verify existence of characters in the string

	String a="Good evening students";
	boolean exist=a.contains("stude");
	System.out.println(exist);
	System.out.println(a.startsWith("Good"));
	System.out.println(a.endsWith("student"));
}
}
