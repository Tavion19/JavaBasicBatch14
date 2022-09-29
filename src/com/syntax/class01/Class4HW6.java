package com.syntax.class01;

import java.util.Scanner;

public class Class4HW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many years have you worked?");
		
		double years=scanner.nextDouble();
		
		if(years>=5) {
			System.out.println("Congratulations, you are eligible for a bonus!");
			
			System.out.println("How much is your annual salary?");
			double sal=scanner.nextDouble();
			if (sal>50000) {
				System.out.println("You get a bonus of 5000!");
				
			}else {
				System.out.println("You get a bonus of 3000!");
				
			}
		}
			

	}

}
