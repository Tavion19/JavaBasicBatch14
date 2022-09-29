package com.syntax.class01;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your birth month");
		
		String bday=scan.nextLine();
		
		String season;
		
		if(bday.equals("December") || bday.equals("January") || bday.equals("February")) {
			season = "Winter";
			
		}else if(bday.equals("March") || bday.equals("April") || bday.equals("May")) {
			
			season = "Spring";
			
		}else if(bday.equals("June") || bday.equals("July") || bday.equals("August")) {
			
			season = "Summer";
			
		}else if(bday.equals("September") || bday.equals("October") || bday.equals("November")) {
			
			season = "Fall";
			
			
			
			
		}
	}

}
