package com.class11T;

public class RetrievingAllValues {
public static void main(String[] args) {
	
	int[][]num= {
			{12,12,13,14},
			{21,22,23},
			{31,32,33,34},
	};
	int rows=num.length;
	//System.out.println(rows);
	
	
	int cols=num[1].length;
	//System.out.println(cols);
	
	
	for(int row=0; row<num.length; row++) {
		for (int col=0; col<num[row].length; col++) {
			//System.out.println(num[row][col]);
		}
		String[][] food={
				
				{"burger","fries","hot dog","meatloaf"},
				{"rice","mein"},
				{"biryani","korma","naan","peas"},
		};
	for (int i=0; i<food.length; i++) {
		for( int j=0; j<food[i].length; j++) {
			System.out.println(food[i][j]+" ");
		}
		System.out.println();
	}
}
}}
