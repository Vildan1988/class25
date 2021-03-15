package com.class33;

import java.util.ArrayList;
import java.util.List;

public class InstructorList {
	
	public static void main(String[] args) {
		//create a list that will hold 5 instructor
		
		List<Instructor> ilist=new ArrayList<>();
		
		ilist.add(new Instructor("Asel","Umurzakova"));
		ilist.add(new Instructor("diego","juarez"));
		ilist.add(new Instructor("mohammed","shokriyan"));
		ilist.add(new Instructor("wegas","haq"));
		
	//advance loop
		for(Instructor i:ilist) {
		System.out.println(i.lastName);
		i.display();
		}
	}
	

}
