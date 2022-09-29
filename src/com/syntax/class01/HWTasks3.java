package com.syntax.class01;

import java.util.Scanner;

public class HWTasks3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that reads two people's first
		 * names and if they expecting boy or girl? 
		 * Based on the input suggests a name for a baby:
		 * Example Output:
		 * Mom’s first name? Mary
		 * Dad’s first name? Daniel
		 * Boy or Girl? boy
		 * Suggested baby name: DANRY
		 * Example Output:
		 * Mom’s first name? Mary
		 * Dad’s first name? Daniel
		 * Boy or Girl? girl
		 * Suggested baby name: MAIEL
		 * 
		 */
		
		String motherName="Mary";
		String fatherName="Daniel";
		boolean isBoy=false;
		String firstHalf;
		String secondHalf;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the name of mother");
		motherName=scanner.next();
		System.out.println("Please enter the name of father");
		fatherName=scanner.next();
		System.out.println("Are you expecting a boy or girl boy=true girl=false");
		isBoy=scanner.nextBoolean();
		
		
		if(isBoy) {
			firstHalf=fatherName.substring(0,fatherName.length()/2);
			secondHalf=motherName.substring(motherName.length()/2);
			System.out.println(firstHalf+secondHalf);
		}else {
			firstHalf=motherName.substring(0,motherName.length()/2);
			secondHalf=fatherName.substring(fatherName.length()/2);
			
		}
			System.out.println(firstHalf+secondHalf);
		
	}

}
