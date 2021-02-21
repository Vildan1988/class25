package com.class11T;

public class Task2 {
	public static void main(String[] args) {
		/*1.soru create an array of cars and store 6 elements into it.
		 * using 2 different loops print all values from the array. 
		 */
		/*2.soru create an array of countries. while retrieving all values 
		 * from an array print capital for each country(use 2 different) 
		 * 
		 */
		//1 WAY
		String[] array= {"usa", "rusia","turkey","spain"};
		for(int i=0; i<array.length; i++) {
			if (array[i].equals("usa")) {
				System.out.println("washington dc");
			}else if (array[i].equals("rusia")) {
				System.out.println("moscow");
			}else if (array[i].equals("turkey")) {
				System.out.println("ankara");
			}else if (array[i].equals("spain")) {
				System.out.println("madrid");
			}
		}
		
		
		String[] countries= {"usa", "afganistan","kazakistan","ukraine"};
		for(String country:countries) {//1.country usa,2, afganistan
			
		switch(country) {
		case "usa":
			System.out.println("washington dc");
		    break;
		case"afganistan":
			System.out.println("kabul");
			break;
		case"kazakistan":
			System.out.println("astana");
		    break;
		case "ukraine":
			System.out.println("kiev");
			break;
			
	
	}
		}
		
		}}
