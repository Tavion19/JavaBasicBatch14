package com.syntax.class01;

public class Recap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to format code use: CMD+SHIFT+F
		//windows: CTRL+SHIFT+F
		
		boolean allergy=false;
		
		String allergyType="Peanut";
		
		if(allergy) {
			System.out.println("Let's check what allergy you have");
			
			if(allergyType.equals("Pollen")) {
				System.out.println("Try to stay indoors when trees are full");
			}else if (allergyType.equals("Peanut")) {
				System.out.println("Please stay away from peanuts");
			}else if (allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy products");
			}else {
				System.out.println("We need to do some test");
			}
			
		}else {
			System.out.println("You are lucky");
		}
	}

}
