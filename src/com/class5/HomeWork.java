package com.class5;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		/*create a java program that will ask if user has a credit
		 * card or not.
		 * if you user does not have credit card then offer them.
		 * if they do have ask what is balance on the card?
		 * if balance of the card is larger than 1000, tell them to pay
		 * of otherwise you can tell them that can spend more.
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("do you have a credit card? true or false");
		boolean cc=input.nextBoolean();
		
		if (cc) {
			  System.out.println("what is the balance on your card");
			
			  int balance=input.nextInt();
			  if (balance>1000) {
				System.out.println("pls pay off your balance");
			  }else {
				System.out.println("you can spend more money");
			}
		}else {
			System.out.println("would you like apply for card");
		}
		
	}
	

}
