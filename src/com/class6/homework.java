package com.class6;

import java.util.Scanner;

public class homework {
public static void main(String[] args) {
	
	/*write a program that will read three inputs of scores
	 * (quiz,mid,term, final scores) and determine the grade based on 
	 * the following rules;
	 * if average score >=90-->grade A
	 * if average score >=70 and <90 -->grade B
	 * if average score >=50 and <70 -->grade C
	 * if average score <50-->grade D
	 */
	
	Scanner scan;
	
	int quiz,midterm,finalscore,average;
	scan=new Scanner(System.in);
	System.out.println("pls enter quiz score");
	quiz=scan.nextInt();
	
	System.out.println("pls enter midterm score");
	midterm=scan.nextInt();
	
	System.out.println("pls enter final score");
	finalscore=scan.nextInt();
	
	average=(quiz+midterm+finalscore)/3;
	
	if (average>=90) {
		System.out.println("A");
	}else if (average>=70 && average <90) {
		System.out.println("B");
	}else if (average>=50 && average<70 ) {
		System.out.println("C");
	}else if (average<50) {
		System.out.println("D");
	}else {
		System.out.println("unknown");
	}
	
	
	
}
}
