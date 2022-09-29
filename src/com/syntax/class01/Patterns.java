package com.syntax.class01;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=4; i++) {
			
			for (int j=1; j<=3; j++) {
				
				System.out.println("* ");
			}
			System.out.println("----------------------");
			for (int d=1; d<=4; d++) {
				
				System.out.println(d+" ");
			}
			
			System.out.println();
		}
		System.out.println("-----------------------");
		
		for (int c=1; c<=5; c++) {
			
			for (int r = 1; r<=5; r++) {
				System.out.println(r+" ");
				
			}
			System.out.println();
		}
	}

}
