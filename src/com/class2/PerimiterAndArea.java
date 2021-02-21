package com.class2;

public class PerimiterAndArea {
	
	public static void main(String[]args) {
		int width=5;
		int height=8;
		int area=width*height;
		int perimeter=2*(width+height);
		/*
		 * the perimeter of a rectangle with width___and height___ is equal to ___and the area
		 * is__
		 */
		
		
		System.out.println("The perimeter of rectangle with "+width+" and height "+height+
				" is equal to "+perimeter+ " and the area is "+area);
		
		String message="The perimeter of rectangle with "+width+" and height "+height+
				" is equal to "+perimeter+ " and the area is "+area;
		
		System.out.println(message);
	}

}
