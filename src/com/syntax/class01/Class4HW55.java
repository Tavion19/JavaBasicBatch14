package com.syntax.class01;

import java.util.Scanner;

public class Class4HW55 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Do you have a credit card? Please enter Yes or No");
		
		String question=scanner.next();
		
		if(question.equals("Yes")) 
		{
			System.out.println("What is the balance on your card?");
			
			double bal=scanner.nextDouble();
			if(bal>1000) {
				System.out.println("Please pay pff your card immediately.");
			}
			else {
			System.out.println("You can spend more.");
			
		}
			
		
		}else{
		
		System.out.println("Would you consider getting one?");
	}

	}
	
}
