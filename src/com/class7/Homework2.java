package com.class7;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		
	
		/* you need to ask user to pay for coffee
		 * you need to keep asking user to pay for it 
		 * until entered price is equal=5;
		 * after user paid then say "enjoy your coffee!"
		 */
	//1 way do while        // best example
		Scanner scan=new Scanner(System.in);
		int price;
		do {
			
		System.out.println("pls pay for your coffee");
		 price=scan.nextInt();
		
	
		}while(price!=5);
		System.out.println("enjoy your coffee");
		
		
		//2 way with while
		int price1;
		System.out.println("pls pay your coffee");
		price1=scan.nextInt();
		
		while (price1!=5) {
			System.out.println("pls pay your coffee");
			price1=scan.nextInt();
			
		}
		System.out.println("enjoy your coffee");
		
	}

}
