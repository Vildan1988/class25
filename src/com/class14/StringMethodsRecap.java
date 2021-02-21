package com.class14;

public class StringMethodsRecap {

	public static void main(String[] args) {
		// .replace
		
String str="your Syntax Technologies. is your place to study";
		System.out.println(str.replace('y', 'i'));
		System.out.println("++++++++++++++++++");

System.out.println(str.replace("your", "my"));

//.replaceAll
String str2="video provides a powerful way to help you";
System.out.println(str2.replaceAll("way(.*)", ""));

String str3="23423Hell^389!@##$%%%^27o";

System.out.println(str3.replaceAll("[^0-9]", ""));
System.out.println(str3.replaceAll("[^a-zA-Z]", ""));
//kisa yoldan sadece rakamlari yazmak icin sapka koy 
//a-zA-Z yazmak yerine,kelimeler icinde gecerli


System.out.println("=================");
System.out.println(str2.replaceFirst(" ", ""));

	}

}
