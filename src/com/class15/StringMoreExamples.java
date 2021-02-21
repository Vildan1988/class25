package com.class15;

public class StringMoreExamples {
public static void main(String[] args) {
	//3.) check existence of other character sequence
	//contains();
	//starsWith();
	//endWith();
	//4.) get character at specific position
	//charAt();
	
	//get a character at specific location
	String str="Syntax Technologies inc";
	char letter=str.charAt(5);
	System.out.println(letter);
	//length 19
	//System.out.println((str.length()));bu calisir uzunlukta
	
	//System.out.println(str.charAt(str.length()));//StringIndexOutOfBoundsException
	
	System.out.println(str.charAt(str.length()-1));
	
	//get a substring from a String
	//syntax
	String substr1=str.substring(0,6);
	System.out.println(substr1);
	//technologies inc
	String substr2=str.substring(7);
	System.out.println(substr2);
}
}
