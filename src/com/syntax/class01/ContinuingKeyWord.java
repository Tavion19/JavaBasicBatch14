package com.syntax.class01;

public class ContinuingKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1; i<5; i++) {
			
			if (i==3) {
				continue;
			}
			
			System.out.println("Hello");
			System.out.println("How are you");
			System.out.println(i);
		}
		
		// I want to print numbers from 1 to 20 except number 6, 7, and 8
		
		for (int i=1; i<=20; i++) {
			
			if(i==3 || i==7 || i==11) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
