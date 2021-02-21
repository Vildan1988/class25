package com.class10;

public class ArrayIntro {
public static void main(String[] args) {
	 int a;
	 a=10;
	 int a1=10;
	 //1 way
	 int[] b; // declare an array--> prefer way
	 int c[];
	 b=new int[4]; //0,1,2,3 elements //initialize
	 
	 //2way all in 1line (declaration & initialization)
	 int[] array=new int[4];
	 array[0]=10;
	 array[1]=20;
	 array[2]=30;
	 array[3]=40;
	 //access value from an array
	 System.out.println(array[2]);
	 
	 //lets create an array that will store classes
	 String[] classes=new String[4];
	 
	         classes[0]="java";
			 classes[1]="SDLC";
			 classes[2]="MANUAL TESTING";
			 classes[3]="git";
			 //today we have java class
 System.out.println("today we have "+classes[0]+" class");
 System.out.println("----------------------------------");
 int[]nums=new int [3];
 nums[0]=1;
 nums[1]=2;
 nums[2]=3;
 //how can i can 1 to 100
 nums[0]=100;
 System.out.println(nums[0]);
 System.out.println(nums[0]+nums[2]); //100+3
 //the size of an array is fixed
 String[]names=new String[3];
 
 names[1]="meliha";
 names[2]="rafia";
 //names[3]="vildan";during run time we will get an exception
 //ArrayIndexOutOfBoundsException
 System.out.println(names[0]);
 
 // we are putting less elements inside 
 //compiler will give default values
double[] numbers=new double[4];
 numbers[1]=100;
 numbers[3]=200;
 System.out.println(numbers[1]);
 
 
 
}
}
