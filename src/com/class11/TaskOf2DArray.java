package com.class11;

public class TaskOf2DArray {
	public static void main(String[] args) {
		
		int [][] numbers= {
				{8,7,5,3,8},
				{1,5,6,4,9},
				{3,6,8,0,7},};
		
		int sum=0;
		for (int i=0; i<numbers.length; i++ ) {
			for(int j=0; j<numbers[i].length; j++) {
	//System.out.print(numbers[i][j]+" ");
		
				sum=sum+numbers[i][j];
		
}
System.out.println();
		}
System.out.println("the sum of all elements in array is="+sum);
int sum1=0;
for(int nums[]: numbers) {
	for (int getNum:nums) {
		if(getNum%2==0) {
			System.out.println(getNum+" is even number");
			}
		sum1=sum1+getNum;
	}}
System.out.println("the sum of all elements in array is="+sum1);
	}

		


}
	
	
