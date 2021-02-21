package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {
	public static void main(String[] args) {
		/* ask user the enter their gender F or M
		 * based on the input provide
		 * if F --> Female
		 * if M --> male 
		 * otherwise --> unknown 
		 */
		
	Scanner scan=new Scanner(System.in);
	System.out.println("pls enter your gender: F or M");
	char gender=scan.next().charAt(0);
	String userGender;
	//works only with byte,short,int,char,String
	switch(gender)	{
	
	
	case'F':
		userGender="female";
		break;
	case'M':
		userGender="Male";
		break;
		default:
			userGender="unknown";
	}
		
	System.out.println("your gender is "+ userGender);	
		
	}

}
