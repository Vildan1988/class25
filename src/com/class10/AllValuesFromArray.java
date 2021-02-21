package com.class10;

public class AllValuesFromArray {
	public static void main(String[] args) {
		
        // 0   1   2   3   4   5
char[]grades={'A','B','C','D','E','F'};
int a=2;
	System.out.println(grades[4]);
	System.out.println(grades[a]);
	a+=2;//2+2
	//System.out.println(grades[a]);
	a--;//3
	//System.out.println(grades[a]);
	
	//System.out.println(grades[0]);
	//System.out.println(grades[1]);
	//System.out.println(grades[2]);
	//System.out.println(grades[3]);
	
	for(int i=0; i<grades.length; i++) {
		System.out.println(grades[i]);
	}	
		System.out.println("-----------------");
String[]animals= {"cat","dog","cow","snake","elephant"};

int size=animals.length;
for (int i=0; i<size; i++) {
	//System.out.print(animals[i]+" ");
	
}
	//create an array to store 5 double values, print all in 1 line	
		
		double[]numbers= {1.1,2.2,3.3,4.4,5.5};
	    System.out.println(numbers[2]);
	    System.out.println("--------------");
	    double num=numbers.length;

	    for (int i=0; i<num; i++ ) {
		System.out.println(numbers[i]+" ");
		}
		
	}
	 
	}


