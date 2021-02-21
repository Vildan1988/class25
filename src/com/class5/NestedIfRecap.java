package com.class5;

public class NestedIfRecap {

	public static void main(String[] args) {
		/*verify if button is displayed on the page 
		 * if button is displayed than we need to verify text on
		 * if text equal to sign in -->test case pass
		 * otherwise -->wrong text is displayed
		 */
		
		boolean isDisplayed=true;
		String buttonText="Sign In";
		
		if (isDisplayed) {
		System.out.println("button is displayed");
		
		if(buttonText.contentEquals("Sign In")) {
		System.out.println("test case pass");
		
			}else {
			System.out.println("wrong text is displayed");
			}
		
		}else {
		System.out.println("button is not displayed");
			
			}
		}
	}

