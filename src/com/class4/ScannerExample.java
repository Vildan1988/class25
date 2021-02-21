package com.class4;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		//scanner is a class in java that will allow us to take an input 
		//from a user.scanner will help us to make our program more 
		//interactive.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter any number");
		
		/*nextInt();-->for numbers		
		 *nextLine();-->strings
		 *nextDouble();-->double  
		 */
		int number=scan.nextInt();
		System.out.println("entered number is "+number);
		System.out.println("**************************");
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine();
		System.out.println("good afternoon "+name);
		
		
		
	}

}
