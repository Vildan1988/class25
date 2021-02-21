package com.class5;

public class LogicalNot {
public static void main(String[] args) {
	
	boolean b1=!true;
	boolean b2=!false;
	System.out.println(b1);
	System.out.println(b2);
	
	boolean traffic= true;
	
  if (!traffic) { // using we are reverting condition
	  System.out.println("hello");
 }else {
	 
	System.out.println("bye");
	
	boolean isRain=false;
			if (!isRain) {
				System.out.println("take an umberalla");
			}else {
				System.out.println("do not take an umberalla");
			}
	//let compare 2 numbers using not operator
	
		int num1=10;
		int num2=10;
		
		
		if (num1==num2) {
			System.out.println("numbers are equal");
		
		}else {
			System.out.println("numbers ar not equal");		
			
		
         }
		if (!(num1==num2)) {
			System.out.println("numbers are not equal");
		}else {
			System.out.println("numbers are equal");
		}
		
		//if name is not mary or  anna then you are not my sister
		String name="mary";
		String name2="anna";
		
		//true or false--> true add not--> false
		if (!(name.equals("mary")|| name2.equals("anna"))) {
			
			System.out.println("you are not my sister");
			
		}else {
			System.out.println("you are my sister");
		}
		
		
		
		
		
		
		
		
		
}
}}
