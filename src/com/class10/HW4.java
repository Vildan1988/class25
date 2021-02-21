package com.class10;

import java.util.Scanner;

public class HW4 {
	public static void main(String[] args) {
		Scanner scan;
		int secretNumber, guessNumber;
		scan=new Scanner(System.in);
		secretNumber=12;
	do {
		System.out.println("pls guess my number from 1 to 20");
		guessNumber=scan.nextInt();
		if (guessNumber< secretNumber) {
			System.out.println("your number is too small");
		}else if(guessNumber>secretNumber) {
			System.out.println("your number is too large");
		}
			
	}while(guessNumber!=secretNumber);
	System.out.println("congratulations you got it");
	
	}

}
