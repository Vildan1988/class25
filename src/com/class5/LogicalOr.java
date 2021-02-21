package com.class5;

public class LogicalOr {
public static void main(String[] args) {
	
	//7 days a week
	//if days 2 or 4--> SDLC class
	//if day 6 or 7 --> Java class
	//if day1 or 5 --> no class
	//if day=3--> review class
	
	
	int day=7;
	
	
	    //false or false--> false
	if (day==2 ||day==4) {
		System.out.println("SDLC Class");
	
		
		//true or false-->true	
	}else if(day==6 || day==7) {
		System.out.println("java class");
		
		//false or false-->false
	}else if(day==1 || day==5) {
		System.out.println("no class");
		
	}else if (day==3){
		System.out.println("review class");
		
	}else {
		System.out.println(" not a valid day");
	}
	
	//7 days a week
		//if days tuesday or  thursday--> SDLC class
		//if day saturday or sunday --> Java class
		//if day monday or friday --> no class
		//if day wednesday-> review class
		
String weekDay="friday";

	if (weekDay.equals("tuesday")||weekDay.equals("thursday")) {
		System.out.println("SDLC class");
		
	}else if (weekDay.equals("saturday")|| weekDay.equals("sunday")) {
		System.out.println("java class");
		
	}else if (weekDay.equals("monday")|| weekDay.equals("friday")) {
		System.out.println("no class");
			
	}else if (weekDay.equals("wednesday")) {
			System.out.println("review class");
				
	}else {
			System.out.println(" not a valid day");
				
			}
				
			}
				
			
	}
	


