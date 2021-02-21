package com.class4;

public class Task {
public static void main(String[] args) {
	
	/*create a java program and store values of mortgage rate
	 * and mortgage price.
	 * program should check if rate is higher than 4.5 user will not
	 *  buy a house, otherwise user will consider buying.
	 *  once user decides to buy a house,
	 *  if price of the house is larger than 200000 than user will 
	 *  take loan, otherwise user will pay cash. */
	
	double rate=4;
	double price=2000000;
	if (rate>=4.5) {
		System.out.println("i am not buying the house");
	
	}else {
		System.out.println("i will buying the house");
	if (price>200000) {
		System.out.println("i will need a loan to by house");
	}else {
		System.out.println("i will pay cash for my house");
	}
}
	
	}



}

