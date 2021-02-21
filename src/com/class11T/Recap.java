package com.class11T;

public class Recap {
	public static void main(String[] args) {
/*
 *  let's create an array of names thats will hold 
 *   5 elements and retrieve all values from it  		
 */
		
// 1.create	an array using new keyword	
		
String[] names=new String[5];
names[0]="asel";
names[1]="ali";
names[2]="veli";
names[3]="deli";		
names[4]="seli";		
//names[5]="reli";
//will get an runtime exception when trying to access it	
		
for (int i=0; i<names.length; i++) {
	System.out.println(names[i]);
}
//2. create an array using literal 
                       // 0      1       2      3      4
String[] studentNames= {"ayse","fatma","bilal","ali","veli"};


System.out.println("-----------for loop---------");
for (int i=0; i<=studentNames.length-1; i++) {
	System.out.println(studentNames[i]);
}
//retrieve values using:
//advanced for loop, for each loop,enhanced for loop
System.out.println("-----------advanced for loop--------");
for (String student:studentNames) {
		System.out.println(student);
		
}
	}

}
