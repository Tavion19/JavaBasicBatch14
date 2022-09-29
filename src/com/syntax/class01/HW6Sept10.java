package com.syntax.class01;

import java.util.Scanner;

public class HW6Sept10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		double price = 5;
		double user;
		
		do {
			System.out.println("Please pay for your coffee.");
			
			user=sc.nextDouble();
			
			if(user>price) {
				
				System.out.println(" Please pay less. ");
				
				System.out.println("----------------------");
				user=sc.nextDouble();
			}
			else if(user<price)
			
				System.out.println(" Please pay more. ");
				
				System.out.println("--------------------------");
				
			} while (user != price);
			
				System.out.println("Enjoy your coffee");
		
		
	}

}
