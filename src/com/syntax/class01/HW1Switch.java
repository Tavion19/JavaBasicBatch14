package com.syntax.class01;

import java.util.Scanner;

public class HW1Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ask user to enter their country and capture it.
		 *  Once values are captured print which language user speaks.
		 * 
		 * 
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the name of your country");
		
		String country=scan.nextLine();
		String language;
		
		switch (country) {
		
		case "Usa":
			language="English";
			break;
			
		case "China":
			language="Chinese";
			break;
			
		case "Brazil":
			language="Portugese";
			break;
			
		case "Cuba":
			language="Spanish";
			break;
			
		case "Egypt":
			language="Arabic";
			break;
			
		case "Germany":
			language="German";
			break;
			
		default:
			language="Unknown";
			break;
		}
		System.out.println("You are from "+country+" and your language is "+language+"!");
		
		
		{
			
			
			
			
			
		}
		
	}

}
