package com.syntax.class01;

import java.util.Scanner;

public class Class4HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the mortgage rate now?");
		
		double mortgageRate=scanner.nextDouble();
		
		if (mortgageRate>4.5) {
			System.out.println("I will not buy the house");
			
			}else {
				System.out.println("I will consider buying the house");
		}
		System.out.println("What is the price of the house?");
		
		int priceHouse=scanner.nextInt();
		
		if (priceHouse<200000)
			{System.out.println("I will pay cash");
			
			}else{
				
				System.out.println("I will take a loan");
			}
		System.out.println("What amount of loan do you need?");
			
				double loanAmount=scanner.nextDouble();
				
				if (loanAmount<=200000) {
					System.out.println("This loan amount can be approved!");
				}else {
					System.out.println("Sorry, we have to reject!");
					
				}
			}
	{
		}


}
