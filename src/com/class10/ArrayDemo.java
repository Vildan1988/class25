package com.class10;

public class ArrayDemo {
	public static void main(String[] args) {
		int []nums=new int[5];
		nums[0]=12;
		nums[1]=13;
		nums[0]=14;
		nums[3]=15;
		//to find number of elements inside an array we use
		//.length (property of an array)
		System.out.println(nums.length);
		System.out.println(nums[0]);
		
		                //   0       1       2       3
		String[] array= {"winter","fall","summer","spring"};
		// i was born in summer
		System.out.println("i was born in "+array[2]);
		System.out.println(array.length);
		//array.length will return an integer
		//int arraySize=array.length
		//System.out.println(arraySize);
		
		
		
		}
		
	}


