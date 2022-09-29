package com.syntax.class01;

public class GROUPPROJECTQuest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a java program to print the first numbers of Fibonacci series
		// 0 1 1 2 3 5 8 13 21
		
		int previous=0;
		int currentNumber=1;
		int nextNum=0;
		System.out.println(previous );
		System.out.println(currentNumber);
		for (int i=0;i<8;i++) {
			nextNum=previous+currentNumber;
			System.out.println(nextNum);
			previous=currentNumber;
			currentNumber=nextNum;
		}
	}

}
