package com.class5;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
	//scanner class- to take an input from a user
		Scanner anyVariableName=new Scanner(System.in);
		
		System.out.println("pls enter String value");
		String val=anyVariableName.nextLine(); //take entire line
		
		System.out.println("pls enter boolean value");
		boolean val1=anyVariableName.nextBoolean();
		
		System.out.println("pls enter string value");
		String val2=anyVariableName.next();
		
		System.out.println("pls enter integer value");
		int val3=anyVariableName.nextInt();
		
		System.out.println("pls enter double value");
		double val4=anyVariableName.nextDouble();
		
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		
		
		
	}
}
