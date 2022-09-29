package com.syntax.class01;

import java.util.Scanner;

public class Class4HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println(("City is "));
		String city=scanner.nextLine();
		System.out.println("Temperature is ");
		double temperature=scanner.nextDouble();
		
		temperature=(temperature-32)*5/9;
		
		
		System.out.println("The temperature of "+city+" is "+temperature+" celsius");
		

	}

}
