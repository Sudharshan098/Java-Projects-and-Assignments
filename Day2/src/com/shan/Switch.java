package com.shan;


public class Switch {
	public static void main(String[] args) {
		String city="Mumbai";
		switch(city) {
		case "Coimbatore":{
			System.out.println("Manchester City");
			break;
		}
		case "Mumbai":{
			System.out.println("Financial City");
			break;
		}
		case "Kolkata":{
			System.out.println("City of Joy");
			break;
		}
		case "Bangalore":{
			System.out.println("Cyber City");
			break;
		}
		 default:{
			System.out.println("May be Other Indian City");
			break;
		}
		}
	}
	
}

/*
 * Q1) Explain Type casting and its types with examples.
 * 		Type casting is defined as converting a data type to its equivalent data type and there are two types of type casting
 *		*Implicit -(Lower to Higher)upcasting
 *		*Explicit -(Higher to Lower)downcasting
 *		 			
 *Q3) Explain the difference between local and instance variables.
 *		The difference between the local and instance variables are
 *		*Local variables are declared inside a scope or inside a method that can be accessed only inside that scope
 *		* Instance variables are declared inside the main method and could be accessed anywhere
 */

