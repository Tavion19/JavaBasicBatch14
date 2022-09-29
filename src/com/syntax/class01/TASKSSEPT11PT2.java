package com.syntax.class01;

import java.util.Scanner;

public class TASKSSEPT11PT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int secret = 1234;
		int guess;
		
		do {
			System.out.println("Please guess the secret number: ");
			guess = input.nextInt();
			
					
		}while(guess != secret);
		
		System.out.println("You won!");
		
		
	}

}
