package com.syntax.class01;

import java.util.Arrays;
import java.util.Scanner;

public class GROUPPROJECTQuest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Using scanner create an array of countries. When an array is created for countries and capitals, 
		 * then retrieve all the values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops)
		 * 
		 * 
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter how many conutries you want to process");
		int size=scanner.nextInt(); // asking user to enter the size
		// Two arrays one to store the counties and the other one to store the capitals
		String [] countries=new String[size];
		String [] capitals=new String[size];
		
		// this is just to consume that extra enter that we will be getting from line 21
		scanner.nextLine();
		for(int i=0;i<size;i++) {
			System.out.println("Please enter the country name");
			countries[i]=scanner.nextLine();
			
			System.out.println("Please enter the capital for "+countries[i]);
			capitals[i]=scanner.nextLine();
			
		}
		//Prints the arrays in a good format
		System.out.println(Arrays.toString(countries));
		System.out.println(Arrays.toString(capitals));
		
		for(int i=0; i<size;i++) {
			System.out.println("The Country "+countries[i]+" has the capital "+capitals[i]);
		}
	}

}
