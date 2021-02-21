package com.class13;

public class ReplaceMethodStringClass {

	public static void main(String[] args) {
	
		/*.replace() method
		 * this method returns anew string resulting
		 * from replacing all occurrences of oldchar
		 * in this string with newchar
		 */
		String str="hello dear dan, how are you dan, how you been?";
		/*.replace() method
		 * this method returns anew string resulting
		 * from replacing all occurrences of sequence of string
		 * in this string with newChharsequence
		 */
		
		
		System.out.println(str.replace('n', 'z'));
		System.out.println("__________________");
		System.out.println(str.replace("dear dan", "respected" ));
		System.out.println(str.replaceFirst("dan", "ali"));
		
		
		
}
}