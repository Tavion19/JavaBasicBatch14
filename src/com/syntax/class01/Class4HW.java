package com.syntax.class01;

import java.util.Scanner;

public class Class4HW {

	public static void main(String[] args) {
		
		boolean diploma=true;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a diploma? Please enter true or false");
		boolean Diploma= scanner.nextBoolean();
		
		
		if(diploma == true)
		{System.out.println("Congratulations");
		System.out.println("What is your GPA score?");
		
		
		double gpa =scanner.nextDouble();
		
		if(gpa>=3.5) {
			System.out.println("You are eligible for scholarship");
		}else 
		{
			System.out.println("You should have studied harder");
		} 
		
		}else 
		{
			System.out.println("Enroll back into school to get your diploma.");
		}
		}
		
		

}
