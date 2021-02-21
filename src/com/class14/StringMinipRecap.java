package com.class14;

public class StringMinipRecap {
public static void main(String[] args) {
	
	//replace
	String str=new String ("hello");
	String str3=new String ("hello");//string str3==str;(true)
	System.out.println(str==str3);
	
	System.out.println("++++++++++++=");
	
	String s1="hello";
	String s2="hello";
	
	System.out.println(s1==s2);
	
	
	System.out.println(str);
	String str2=str.replaceAll("hello", "bye");
	System.out.println(str2);
	
}
}
