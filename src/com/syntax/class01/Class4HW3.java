package com.syntax.class01;

import java.util.Scanner;

public class Class4HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your age?");
		
		int ageToDrive=scanner.nextInt();
		
		if (ageToDrive>=18) {
			System.out.println("We will issue you a drivers license");
			}else {
				System.out.println("We offer you to get a learners permit");
				
		}
	}

}
