package com.syntax.class01;

import java.util.Scanner;

public class GradeHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your grade.");
		
		char grade=scan.next().charAt(0);
		
		String explanation;
		
		switch(grade) {
		
		case 'A':
			explanation="Excellent";
			break;
			
		case 'B':
			explanation="Good";
			break;
			
		case 'C':
			explanation="Average";
			break;
			
		case'D':
			explanation="Bad";
			break;
			
		case 'F':
			explanation="Fail";
			break;
			
		default:
			explanation="Not Acceptable";
			break;
		}
		System.out.println("Your grade is "+grade+", which means "+explanation+"!");
		
		
		
	}

}
