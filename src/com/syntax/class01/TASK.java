package com.syntax.class01;

import java.util.Scanner;

public class TASK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What is your height");
		double height=scanner.nextDouble();
		
		if(height<=60) {
			System.out.println("You are short");
			
		}else if (height>60 && height<72) {
				System.out.println("You are medium");
			
		}else if(height>72)
				System.out.println("You are tall");	
		
		
	}

}
