package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {
public static void main(String[] args) {
	/*ask user to enter age
	 * if age is from 1to 3-->you are baby
	 * if age 3 to 5 --> you are toddler
	 * if age from 5-12--> you are  KID
	 * IF YOUR AGE 12-19--> TEENAGER
	 * IF YOUR AGE >20 YOU ARE AN ADULT
	 */
	
	int age;
	Scanner scan;
	
	scan=new Scanner(System.in);
	System.out.println("please enter your age");
	age=scan.nextInt();
	 
	String human;
	
	if (age>=1&& age <=3) {
		//System.out.println("you are a baby");	
		human="baby";
				
	}else if (age>3 && age <=5) {
		//System.out.println("you are toddler");
		human="toddler";
		
	}else if(age>5 && age<=12) {
		//System.out.println("you are kid");
		
		human="kid";
		
	}else if (age>12 && age<=19) {
		//System.out.println("you are teenager");
		 
		human="teenager";
		
	}else if (age>19) {
		//System.out.println("you are an adult");	
		
		human="adult";
	}else {
		
		human="unknown";
		//System.out.println("invalid age entered");
	}
	System.out.println("you are "+human);
	
	
	
	
	
	
	
}
	
	
	
}
