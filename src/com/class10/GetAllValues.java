package com.class10;

public class GetAllValues {
	public static void main(String[] args) {
		String[]animals={"cat","dog","cow","dog","elephant"};
		//i want to print all values from an array
		//when value is dog--> i love dogs
		for(int i=0; i<animals.length; i++) {
			
			if(animals[i].equals("dog")) {
				System.out.println(" I love dog");
			}else {
				System.out.println(animals[i]);
				
			}
			
			
			
			
			
		}

	}

}
