package com.class2;

public class VariableDeclaration {
	
	
	public static void main(String[]args) {
		
		//1. declaring variable num1 that will hold value of int and 
		//assigning/ initializing value of 123 to it.
		 int num1=123;
		 int num2=2654;
		 long num3=64644898343l;
		 
		 
		  char num4='A';
				  
				  
		 //2. declare variable first and then assign value
		 int n1;
		 int n2;
		 int n3;
		 
		 n1=45;
		 n2=345;
		 n3=4322;
		 //3.declare all variable together and then assign value
		 int number1, number2, number3;
		 
		 number1=12;
		 number2=24;
		 number3=65;
		 
		 System.out.println(n1);
		
		n1=26;
		n2=33;
		System.out.println(n2);
		
		boolean var=true;
		System.out.println(var);
		
		 char myVariable='^';
		 System.out.println(myVariable);
		 
		number2=number1;
		System.out.println(number2);
		//number2=false;--> compile time error asking  to change data type
		//of variable number2 to boolean.
		  
		//variable can be decpared only ONCE!!
		// YOU MUST  put values of specified data type ONLY
		//values of variable CAN  be change later in the program
		// we can use values of other variables to initialize another variable
		
		
		// boolean isRain=false;
		//boolean isSnow;
		//isSnow=isRain; cevap isSnow=false
		
		boolean isRain=false;
		boolean isSnow;
		isSnow=isRain;    //isSnow=false
		isSnow=true;		
		System.out.println(isSnow);
		
		
		
		
	}
}
