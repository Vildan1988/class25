package com.class25_1;

public class ConstructorOverloding {
	
	//different amount of parameters
	ConstructorOverloding(){
		System.out.println("i am non-argument constructor");
	}
	
    ConstructorOverloding(String str){
    	System.out.println("I am constructor with 1 string parametre");
    }
    //having different type of parameters
    
    ConstructorOverloding(int num){
    	System.out.println("I am constructor with 1 int parametre");
    }
}
