package com.class4;

public class IfElseRecap {
	public static void main(String[] args) {
		
		/*Class schedule
		 * if tuesday-->sdlc 
		 * if wednesday-->java review
		 * if thursday-->sdlc
		 * is saturday--> java coding
		 * if sunday-->my favorite java coding
		 */
		
		int day=3;//ya bu sekilde yaz ya da(int day; sonra day=3;)yaz
		if (day==2) {
			System.out.println("SDLC Class");
		}else if (day==3) {
			System.out.println("Review Class");
		}else if (day==4) {
			System.out.println("SDLC Class");
		}else if (day==6) {
			System.out.println("java coding");
		}else if (day==7) {
			System.out.println("my favorite java coding");
		}else {//optinal
			System.out.println(" there is no school");
		}
		
		
		
		
		
		
		
	}

}
