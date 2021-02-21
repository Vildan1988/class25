package com.class7;

public class WhileLoop {
	public static void main(String[] args) {
		
		int time=8;
		if (time<12) { //condition is true
			System.out.println("good morning"); //code executes 1
		
			
		} 
		System.out.println("-----------------------------");
		while (time<12) { //if condition is true
			System.out.println("good morning");//code executes infinitely
			time++;
			System.out.println("***************");
		//i want to print GA 5 times	
			
		int i=-1;
		while(i<4) {
			System.out.println("good afternoon");
			i++;
		}
			
		System.out.println("outside of while loop");	
			
			
			
		}
	}

}
