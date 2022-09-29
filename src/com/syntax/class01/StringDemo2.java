package com.syntax.class01;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName="Olena";
		String lastName="Dudka";
		System.out.println(firstName+lastName); //Mostly this is used
		System.out.println(firstName.concat(" ").concat(lastName));
		
		String str=" ";
		/*
		 * isEmpty() returns true if a string is empty this method will return false even if you have a space
		 * in a string variable however the isBlank method does not count the spaces
		 */
		System.out.println(str.isEmpty());

		//System.out.println(str.isBlank()); goes here but not letting me without error
		
		
	}

}
