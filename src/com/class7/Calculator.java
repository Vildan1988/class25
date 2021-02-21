package com.class7;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	int num1, num2, total=0;
	char op;
	System.out.println("pls enter first number");
	num1 =scan.nextInt();
	System.out.println("pls enter operator");
	op =scan.next().charAt(0);
	System.out.println("pls enter the second number");
	num2 = scan.nextInt();
	
	switch (op) {
	case'*':
		total = num1*num2;
		break;
	case'/':
		total= num1/num2;
		break;
	case'+':
		total=num1+num2;
		break;
	case'-':
		total=num1-num2;
		break;
	default:
		System.out.println("wrong operator");
	}
	System.out.println(total);
}
}
