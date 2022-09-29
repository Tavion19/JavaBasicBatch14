package com.syntax.class01;

import java.util.Scanner;

public class Class4HW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a credit card? Please enter Yes or No.");
		
		boolean credit=scanner.nextBoolean();
		
		if (scanner.equals("Yes")); 
	
		{
			System.out.println("What is the balance of the credit card?");
			
			int balance=scanner.nextInt();
			if(balance>1000) {
				
				System.out.println("Pay it off immediately");
				
			}else 
			{
				System.out.println("Spend more!");
				
		}
		{
			
			System.out.println("Would you consider getting one?");
		
			
		}
	}
	}

}
