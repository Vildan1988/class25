package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {
	public static void main(String[] args) {
		/*ask user to enter name 5 times
		 * and our output should be "good afternoon___"
		 */
		
		Scanner scan=new Scanner(System.in);
		int i=5;
		while(i<10) {
		System.out.println("pls enter your name");
		String name=scan.nextLine();
		System.out.println("good Afternoon " +name);
		i++;
		}	
		
		
}	
		
		
	

}
