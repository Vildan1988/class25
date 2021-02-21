package com.class7;

public class Task {
	public static void main(String[] args) {
	/*create a boolean variable workDay and assign true create int variable	
	 * day and assign it to1 
	 * as long as it is workDay print "i need a day off" and increase day
	 * once day is 6  print " i do not need a day off any more"
	 */
		
		
		boolean workDay=true;
		
		int day=1;
		
		while (workDay) {
			 System.out.println("i need a day off");
			 if (day==6) {
				 System.out.println("i do not need a day of anymore");
				 workDay=false;
				
			 }
			 
			day++;
		}
		
		
		
		
	}

}
