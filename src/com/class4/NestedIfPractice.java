package com.class4;

public class NestedIfPractice {
	public static void main(String[] args) {
		//ifnested; if statement inside another if statement
		
		boolean isFriday=true;
		int day=13;
		//if today is friday only day i want to check if it day is 13
		
		if (isFriday) {
			System.out.println("Today is friday");
			if (day==13) {
				System.out.println("I will watch scary movie");
			}
		}else {
			System.out.println("Today is NOT friday");
		}
		
		
		
		
	}

}
