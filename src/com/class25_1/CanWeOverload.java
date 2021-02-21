package com.class25_1;

public class CanWeOverload {
	
	//can we overload a private method? answer YES

	private void methodOne() {
		System.out.println("I am method one");
	}
	private void methodOne(String str) {
		System.out.println("I am method one with "+str);
	}
	
	//can we overload a main method ?interview question cevap YES
	public static void main(String str,String[] args)
	 {
		System.out.println("I am a main method with string array");
	}
	
	public static void main(String str) {
		System.out.println("I am a main method with String arguments");
	}
	 
	 public static void main(String[] args) {
		System.out.println("I am a main method with 2 parameters");
		CanWeOverload.main("String");
		String[] array= {"A","B"};
		main("hello",array);
		
		
	}
}