package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {
	
	/*.tocharArray
	 * this method converts this string to a new character array
     */
		String str="Syntax Technologies";
		
        char []array=str.toCharArray();
        for(char i:array) {
        	System.out.println(i);
        }
        System.out.println(array);
	}

}
