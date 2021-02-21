package com.class11;

public class Recap {
	

	public static void main(String[] args) {
//how to declare and initialize  variable in different ways
	
	int num1=12;
	int num2=14;
	int num3=16;
	
//how declare and initialize multiple variables in one data type 
	int num4=13, num5=50, num6=33;
	
//how declare multiple variables in one data type
	int a,b,c,d;
	
//initialize in two steps
	a=12;
	b=33;
	
// array object creation and giving size
	int [] h=new int [3];//prefer way
	
	//declaring array variables
	int e[];
	int []y,u;
	y=new int [3];
    u=new int [2];
// int y[],u; dersek birinci array ikinci int olarak algilanir
//u=new int [2]; will not compile
	
	
	int[] array=new int [7];
	array[0]=33;
	
	
	int [] numberList= {2,3,5,7};
	
	
	//for (int g=0; g<numberList,length; g++) {//retrieving values using
	//	System.out.println(numberList[g]);
	
			
	//}
	for (int elemen:numberList) {//retrieving values using for-each loop
		System.out.println(elemen);
	}
	
	
	
	
	
	
	
}}
