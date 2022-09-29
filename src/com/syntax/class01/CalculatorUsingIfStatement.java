package com.syntax.class01;

import java.util.Scanner;

public class CalculatorUsingIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		double num;
		System.out.println("Enter the first number.");
		double num1=scan.nextInt();
		System.out.println("Enter the second number.");
		double num2=scan.nextInt();
		System.out.println("Please enter an operator.");
		char opr=scan.next().charAt(0);
		
		
		if(opr=='+') {
			System.out.println(num1+num2);
		}
		else if(opr=='-') {
			System.out.println(num1-num2);
		}
		else if(opr=='*') {
			System.out.println(num1*num2);
		}
		else if(opr=='/') {
			System.out.println(num1/num2);
		}
		else {
			System.out.println("Wrong operation");
		}
		
	}

}
