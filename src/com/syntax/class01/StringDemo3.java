package com.syntax.class01;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=" i love java ";
		System.out.println(str);
		/*
		 * Remove the spaces before and after the String but not the ones which are present in between
		 */
		System.out.println(str.trim());
		
		String str2="Java is very easy";
		/*
		 * 
		 * startsWith=> checks if a string starts with a specific letter or word
		 * 
		 * endWith=> checks if a string ends with a specific letter or word
		 * 
		 * contains=> checks if a string contains a specific letter or word
		 */
		System.out.println(str2.startsWith("J"));
		System.out.println(str2.endsWith("y"));
		/*
		 * Method chaining helps us call multiple methods on a single line one method after an other
		 */
		System.out.println(str2.contains("very"));
		
		
	}

}
