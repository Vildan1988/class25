package com.class25;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("_________Creating an object of a Employee class____________");
		
		Employee emp=new Employee();
		emp.salary=70000;
		emp.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("__________Creating an object of a ScrumTeam class________");
		
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="product backlog, sprint,burnDown Chart";
		sm.ceremonies="Sprint Demo, Planing, Retro,";
		sm.attendScrumMeetings();
		
		System.out.println("_______Creating an object of a Developer class________");
		
		Devoloper dev=new Devoloper();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="sprint Demo, planing";
		dev.attendScrumMeetings();
		
		
		
	}

}
