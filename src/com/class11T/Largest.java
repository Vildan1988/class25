package com.class11T;

import java.util.Arrays;

public class Largest {
	public static void main(String[] args) {
		//create an array of integers and find largest number
		int [] numbers={200,-20,13,499,650000};
		
		int largest=numbers[0];
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]>largest) {
				largest=numbers[i];
			}
		}
	System.out.println("the largest numbers is "+ largest);	
	}

}
