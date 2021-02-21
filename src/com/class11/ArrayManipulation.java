package com.class11;

import java.util.Arrays;

public class ArrayManipulation {
public static void main(String[] args) {
	
	
	String[] actualNames= {"john","smith","alex","tanaz"};
	Arrays.sort(actualNames);
	
	String[] expectedNames= {"smith","john","alex","tanaz"};
	Arrays.sort(expectedNames);
	
	//to sort the elements of an array
	System.out.println(Arrays.toString(actualNames));
	
	
	String actual=Arrays.toString(actualNames);
	String expected=Arrays.toString(expectedNames);
	
	System.out.println(actual.contentEquals(expected));
	
	int[] numbers= {2000,123,34,15,66,99,1,1000,1900};
	for (int i:numbers) {
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("*********");
	
	Arrays.sort(numbers);
	for (int i:numbers) {
		System.out.print(i+" ");
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
