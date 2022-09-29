package com.syntax.class01;

import java.util.Scanner;

public class HW5Sept10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Prompt user to ask name 3 times and print "Good afternoon +name
		
		Scanner sc=new Scanner(System.in);
		String name;
		
		for(int t=1; t<=3; t++) {
			
			System.out.println("Please enter your name");
			
			name=sc.nextLine();
			
			System.out.println("Good Afternoon, "+name+ " ");
			
			System.out.println("---------------------------");
			
			System.out.println();
			
		}
	}

}
