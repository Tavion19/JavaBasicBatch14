package com.syntax.class01;

public class StringDemo {

	public static void main(String[] args) {
		//proper way of creating an object
		String str= new String("Java");
		// Simpler and shorter way provided by Java creators to make our life easier
		String name="Java"; // Only works for string and wrapper class
		/*
		 * Counts the number of characteristics in a string including the spaces
		 */
		
		
		System.out.println(str.length());
		System.out.println(name.length());
		if(name.length()>15) {
			System.out.println("Name can't be more than 15 characters");
		}
	}

}
