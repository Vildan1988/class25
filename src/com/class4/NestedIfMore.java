package com.class4;

public class NestedIfMore {
	public static void main(String[] args) {
		/*check age, if age is less than 16--> you are too young to drive
		 * otherwise we will check if you are older than 18-->
		 * you can get driver license and if not you can get driver permit  
		 */
		
		int age=20;
		
		if (age<16) {
			System.out.println("you are too young young to drive");
		}else  {
				System.out.println("you are eligible to drive");
				
				
		    if (age>=18) {	 
			System.out.println("you can drive alone");		
			}else {
				System.out.println("you need your parents to drive");
			}
		 }
				
			System.out.println("---------------------");	
			/*we need to check if student completed the quiz
			 * if yes -->good job, if not-->not good
			 * if they completed we will check score:
			 * if more than 90--> you got an A
			 * if more than 80-->you got a B
			 * anything below --> you should study more */
	
			
		
			boolean quiz=true;
			int score=100;
			if (quiz) {
				System.out.println("good job!!!");
				
				if (score>=90) {
					System.out.println("you got an A");
			}else if (score>80) {
					System.out.println(" you got a B");	
			}else {
				    System.out.println("you should study more!!!");
			}
			
	    }else {
	 	       System.out.println("not good!!!");
	 	       
	 	       
	 	       
	}
			
		boolean diploma=true;
		int score1=3;
		if(diploma) {
			System.out.println("congratulations");
			if(score1>=3.5) {
				System.out.println("you are eligible for scholarship");
			}else if (score1<3.5) {
				System.out.println("you should study harder");
			}
		}else {
				System.out.println("get a degree");
			}
		
		
		}
				
				
				
			
		

}
