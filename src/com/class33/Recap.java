package com.class33;

import java.util.ArrayList;
import java.util.Iterator;


public class Recap {
	public static void main(String[] args) {
		
		//lets create an ArrayList to store numbers
		
		ArrayList<Integer> numbers=new ArrayList<>();
		
		numbers.add(1);//0
		numbers.add(10);//1
		numbers.add(100);//2
		numbers.add(1000);//index=3, size 4
		
		int size=numbers.size();
		System.out.println(size);//size 4
	
        //add more
		numbers.add(10000);
		//remove
		numbers.remove(size-1);//3
		numbers.remove(1);
		System.out.println(numbers);
		
		//retrieve value from an arrayList
		int element=numbers.get(1);
		System.out.println(element);
		System.out.println("+++++++++++++++++++++++++++++");
		
		//1. for loop 
		for (int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("++++++++++++++++++++++");
		
		//advanced loop
		for(Integer num:numbers) {
			System.out.println(num);
		}
		System.out.println("+++++++++++++++++++++++++");
		
		//I want to get values backward
		for(int i=numbers.size()-1; i>=0; i--) {
			System.out.println(numbers.get(i));
		}
		System.out.println("______________________________");
		
		//3 using Iterator 
		Iterator<Integer>iterator=numbers.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			//int number=iterator.next(); -->autounboxing
			//if (number%2==0){
			//System.out.println(number);
			
		}
		
		
		}

}
