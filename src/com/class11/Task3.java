package com.class11;

public class Task3 {
	public static void main(String[] args) {
		
	//task1
	//create an array of cars and store 6 elements into it
	//using 2 different loops print all values from the array
		
		//task2
		//create an array of countries
		//while retrieving all values from an array 
		//print capital for each country
		// use 2 different loops
		
		String[] countries= {"India","Canada","USA"};
		for (String getCountry:countries) {
			if (getCountry.contentEquals("USA")) {
			System.out.println("The capital of USA is DC");
			}
			
		}
		for (int i=0; i<countries.length; i++) {
			if (countries[i].contentEquals("USA")) {
			System.out.println("The capital of USA is DC");
			}
		}
	}

}
