package com.class11;

public class TwoDimentionalArrays {
	public static void main(String[] args) {
		
		//declare 2D Array
		int [][]array= new int[3][4];
		
	//1st row
		array[0][0]=44;
		array[0][1]=80;
		array[0][2]=33;
		array[0][3]=12;
    //2nd row		
		array[1][0]=24;
		array[1][1]=21;
		array[1][2]=11;
		array[1][3]=36;
	//3rd row
		array[2][0]=54;
		array[2][1]=51;
		array[2][2]=61;
		array[2][3]=46;
		System.out.println(array[0][1]);
		
		//task: create an 2d array of string 
		// with 2 and 3 colums . print 2nd row 3rd colum
		System.out.println("**********");
		int [][] numbers= {
				{8,7,5,3,8},
				{1,5,6,4,9},
				{3,6,8,0,7},};
		
System.out.println("the value in index 1 and 4 is= "+numbers[1][4]);

	// to identify the numbers of rows
System.out.println("the numbers of arrays are:="+numbers.length);

	//to identify the numbers of columns/elements in a row
System.out.println("the numbers of columns are:="+numbers[1].length);
System.out.println("-------------------");


for (int i=0; i<numbers.length; i++ ) {
	for(int j=0; j<numbers[i].length; j++) {
		System.out.print(numbers[i][j]+" ");
	}
}
	}

}
