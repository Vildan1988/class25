package com.Class12;

public class ForEachIn2D {
	public static void main(String[] args) {
	/*create a grocery list:fruits{}
	 *                     :veggies{}
	 *                     :dairy{}
	 *retrieve all values using 2 diffrent loops                     
	 */
		
		String[][] groceryList= {
				{"apple,cherry,orange"},
				{"onion,zuccini,persley"},
				{"milk,cheese,yogurt"},
		
		};
		for(String[] list:groceryList) {
		for (String item:list) {
			
		
			System.out.println(item);
		}
	

}}}
