package com.syntax.class01;

import java.util.Scanner;

public class CalculatorUsingSwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number.");
		double num1=scan.nextDouble();
		
		System.out.println("Enter your second number");
		double num2=scan.nextDouble();
		
		System.out.println("Please enter your operator");
		char opr=scan.next().charAt(0);
		
		double result=0;
		
		switch(opr) {
		case '+':
			result=num1+num2;
			System.out.println(result);
			break;
		case '-':
			result=num1-num2;
			System.out.println(result);
			break;
		case '*':
			result=num1*num2;
			System.out.println(result);
			break;
		case '/':
			result=num1/num2;
			System.out.println(result);
			break;
		default:
			System.out.println("Invalid operator");
		}
	}

}

