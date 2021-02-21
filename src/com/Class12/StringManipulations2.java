package com.Class12;

public class StringManipulations2 {
public static void main(String[] args) {
	
	//contains()--> checks for specific value in the string
	//if value is present -->true, else -->false
	String str="Good morning, students!";
	boolean contains=str.contains("morning");
	System.out.println(contains);
	
	String str1="Good morning, students!";
	boolean contains1=str.contains("Students");// buyuk harften dolayi
	System.out.println(contains1);
	
	String present="Welcome, Vildan";
	String neededValue="WELCOME,";
	
	boolean flag=present.contains("Welcome,");
	System.out.println(flag);
	
	boolean flag1=present.toUpperCase().contains(neededValue);
	System.out.println(flag1);
	
	//startsWith(), endsWith(),-->will return true if String starts/ends
	//with specific value
	//else return -->false
	
	System.out.println("_______startwith & endswith_______");
	
	String str2="syntax";
	boolean starts=str2.startsWith("s");
	System.out.println(starts);
	
	System.out.println(str2.endsWith("y"));
	
	//isEmpty() if length of a string is=0-->string is empty
	//else-->it is not
	System.out.println("_______isEmpty_______");
	
	String str3="";
	boolean isEmpty=str3.isEmpty();
	System.out.println(isEmpty);
	
	//concat() -->will concatenate 1 string to the end of another
	String str4="Hello ";
	String str5="Ali!";
	System.out.println(str4+str5);
	System.out.println(str4.concat(str5));
	
	//System.out.println("_________--__________")
	
	String expected="You may qualify for a multi-policy discount!";
	String actual="  You may qualify for a multi-policy discount!";
	
	//basta yada sonra farketmiyor ama icinde false veriyor.
	//sdece space sepecial char kabul etmiyor.
	//trim() will remove spaces at the begining and at the end of string
	actual=actual.trim();
	System.out.println(expected.equals(actual));
	
	
	
}
}
