package com.class8;

import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	for (int i=1; i<=50; i++ ) {
		if(i%3==0) {
			continue;
		}
		System.out.println(i);
	}
	
	String card;
	Scanner scan=new Scanner(System.in);
	for (int q=1; q<=10; q++) {
		System.out.println("are you apply to a credit card");
		card=scan.nextLine();
		if(card.equalsIgnoreCase("yes")) {
			break;
		}
		
		
		
		//NESTED LOOPS
		 for (int c=1; c<=3; c++) {
			 System.out.println(c);
			 for (int b=1; b<=3; b++) {
				 System.out.println(b);
			 }
		 }
		
		
		
		
		
	}
}
}
