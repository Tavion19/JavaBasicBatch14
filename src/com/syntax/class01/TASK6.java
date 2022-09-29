package com.syntax.class01;

import java.util.Scanner;

public class TASK6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your quiz score");
		double quiz=scan.nextDouble();
		
		System.out.println("Enter your midterm score");
		double midterm=scan.nextDouble();
		
		System.out.println("Enter your final exam score");
		double finExam=scan.nextDouble();
		
		double avg;
		avg = (quiz+midterm+finExam)/3;
		
		String grade;
		
		if(avg>=90) {
			grade="A";
			
		}else if(avg>=70 && avg<90) {
			grade="B";
			
		}else if(avg>=50 && avg<70) {
			grade="C";
			
		}else if(avg<50 && avg>0) {
			grade="F";
						
		}else {
			System.out.println("Please enter valid score!");
			grade="None";
			
		}
		System.out.println("Grade: "+grade);
		
	}

}
