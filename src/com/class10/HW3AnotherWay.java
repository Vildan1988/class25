package com.class10;

import java.util.Scanner;

public class HW3AnotherWay {
	 
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter start number");
			int start=scan.nextInt();
			System.out.println("enter end number");
			int end=scan.nextInt();
			
			int even=0;
			int odd=0;
				
		if (start<end) { //ctrl+shift+o(import kisayol)

	    for(int i=start; i<=end; i++) {
		if (i%2==0) {
		even=even+i;
		}else {
		odd=odd+i;
						
					}
				}
		}else {// if 1num>2num
			System.out.println("pls enter start # less than end number");}
		
	System.out.println("the sum of even numbers is "+ even);
	System.out.println("the sum of odd numbers is "+ odd);
			}
		}



