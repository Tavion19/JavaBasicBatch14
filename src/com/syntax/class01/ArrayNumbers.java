package com.syntax.class01;

public class ArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[] nums= {10,20,30,40,50,60,70,80,90,100};
		int sum = 0;				
	
		System.out.println("Sum of numbers in this array is:= ");
		
		for(int i=0; i<nums.length; i++)
			sum+=nums[i];
		
		
		System.out.println(sum);
		
		System.out.println("-----------------------------------------------");

		sum=0;
		
		for (int number : nums) {
			sum += number;
			
		}
		
		System.out.println(sum);
	}

}
