package com.class13;

public class RegularExpression {
public static void main(String[] args) {
	
	//print only text and not numbers
	
String str="1423Hel35638393lo36356373";
System.out.println(str.replaceAll("[0-9]", ""));//leave only text
System.out.println(str.replaceAll("[a-zA-Z]", ""));//leave only numbers
	//remove everything except text
String str2="hi!@@##How132453543345#$%^1233445";
	System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
}
}
