package com.syntax.class01;

public class GROUPPORJECTQuest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Create 2D Array of integer values. Print the sum of all numbers
		 */
		
		int [][] arr= {
				{10,10,10,20},
				{25,30,54},
				{20,30},
				
		};
		int sum=0;
		for(int[] ar:arr) {
			
			for(int num:ar) {
				sum+=num;
			}
			
		}
		System.out.println(sum);
	}

}
