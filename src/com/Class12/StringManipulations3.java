package com.Class12;

public class StringManipulations3 {
public static void main(String[] args) {
	
	//charAt()--> returns a character at specified index
	String str="Student";
	
	//char character=str.charAt(7);
	//System.out.println(character);
	
	for(int i=0; i<str.length(); i++) {
		System.out.print(str.charAt(i)+",");
		
	}
	System.out.println();
	
	//indexOf()-returns an index of specified character
	System.out.println("--------indexOf()------------");
	
	String str1="Sunday";
	int index=str1.indexOf("d");
	System.out.println(index);
	
	String str2="Syntax Technologies vildan";
	System.out.println(str2.indexOf("Syntax"));//0
	System.out.println(str2.indexOf("vildan"));//
	System.out.println(str2.indexOf("wr"));
	
	//substring() gives another string from your current string
	System.out.println("___________substring ___________");
	
	String str3="today is sunday java class";
	
	String newString=str3.substring(9);
	System.out.println(newString);
	
	
	System.out.println(str3.substring(0,5));//today
	System.out.println(str3.substring(9, 20));//sunday java
	System.out.println(str3.substring(16,20 ));//java
	System.out.println(str3.substring(21));//class
}
}
