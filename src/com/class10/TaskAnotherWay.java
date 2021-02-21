package com.class10; 
/*create an array of countries
 * while retrieving all values from an array
 * print capital for each country
 */


public class TaskAnotherWay {
public static void main(String[] args) {
String[] countries= {"afganistan","colombia","usa","rusia","turkey"};
	


for(int i=0; i<countries.length; i++) {
	
	switch(countries[i]) {
	
	
	case "afganistan":
	System.out.println("kabul");
		break;
	case"colombia":
	System.out.println("bogota");
		break;
	case"usa":
		System.out.println("washington dc");
		break;
	case"rusia":
		System.out.println("moscow");
		break;
	case"turkey":
		System.out.println("ankara");
		break;
		
		
		
		
	}
}
	}

}
