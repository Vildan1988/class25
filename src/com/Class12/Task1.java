package com.Class12;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	
	Scanner scan;
	String userName, password, confirmedPassword,message;
	
	scan=new Scanner(System.in);
	
	System.out.println("pls enter username");
	userName=scan.nextLine();
	
	System.out.println("pls enter password");
	password=scan.nextLine();
	
	System.out.println("pls confirm password");
	confirmedPassword=scan.nextLine();
	
	if(!(userName.isEmpty() && password.isEmpty())) {//1 checkpoint
		
	if (password.length()>8) {//2 checkpoint
			
	if (!password.contains(userName)) {//3 checkpoint
				
	if(password.equals(confirmedPassword)) {//4 checkpoint
		
		message="your username and password has been created";
	}else {
		
		message="password do not match";
	}	
	}else {
		message="password connot contain username";
	}
	}else {
		message="password is to short";
	}
	}else {
		message="username and password cannot be empty";
	}
	System.out.println(message);
	
}
}
