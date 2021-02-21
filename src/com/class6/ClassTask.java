package com.class6;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {
		/* ask user to enter the month they were born 
		 * based on the month define the season
		 * if user is born in jan, feb, dec-->winter
		 * if mar,apri,may-->spring
		 * if jun,july,aug -->summer
		 * if sep, oct, nov --> fall
		 * otherwise--> unknown
		 * at the end of the program
		 * "you were born ____"
		 */
		
		String month=null;
		Scanner scan=new Scanner(System.in);
		System.out.println("month of born");
		month=scan.nextLine();
		String season;
		
		if(month.equals("january") || month.equals("february") ||month.equals("december")) {
			season="winter";
		}else if (month.equals("march") || month.equals("april") ||month.equals("may")) {
			season="spring";
		}else if(month.equals("jun") || month.equals("july") ||month.equals("august")) {
			season="summer";
		}else if (month.equals("september") || month.equals("october") ||month.equals("november")) {
			season="fall";
		}else {
			season="unknown";
		}
		System.out.println("you were born in "+ season);
		System.out.println(month);
		}
	

}
