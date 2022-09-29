package com.syntax.class01;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Tay";
		String lastname= "Blue";
		String grade= "B";
		String city= "Los Angeles";
		String state= "California";
		String phone= "123-234-3456";
		
		System.out.println("My name is " + name + " and my last name is " + lastname);;
		System.out.println(" I am a " + grade + " student" );
		System.out.println(" I live in " + city + " and " + state);
		System.out.println(" And my phone number is " + phone );
		
		city="Boston";
		state="Virgina";
		phone="453-876-9908";
		
		System.out.println("My name is " + name + " and my last name is " + lastname);;
		System.out.println(" I am a " + grade + " student" );
		System.out.println(" And I moved to " + city + " and " + state);
		System.out.println(" My new phone number is " + phone );
		
		
		//rules for identifiers=names (variables, methods
		//1. cannot use keywords as identifiers
		//String new ="hello"; -> error
		
		//2. cannot have spaces in identifiers
		//String last name="Smith"
		
		//3. identifiers cannot start with numbers
		//int 1 number=123
		int number10=123;
		
		/*4. identifiers cannot contain any special characters
		 * boolean hello!=true
		 * except $ or _
		 */
		
		double $price=9.98;
		float _price1=1.99F;
		
		/*
		 * naming conventions
		 * 
		 * Class should start with Uppercase and follow
		 * 
		 */
		
		String Weather="hot"; //not preferred
		String myWeather="cold"; //preferred
		
		
		
		
	}

}
