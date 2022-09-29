package com.syntax.class01;

import java.util.Arrays;
import java.util.Scanner;

public class GROUPPROJECTQuest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Using Scanner create an array of integer values. After array is created,
		 * calculate the sum of all the stored elements in that array.
		 * 
		 * or
		 * 
		 * Using scanner ask the user about the size of the array, create an array of that size. After the array is created, fill the array with numbers,
		 * ask the numbers from the user through console with the help of scanner.
		 * Calculate the sum of all stored elements in that array
		 * 
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		//asks user for a number
		int size=scanner.nextInt(); //creates an array of the above size
		int[] arr=new int[size]; //
		
		for(int i=0; i<size; i++) {
			System.out.println("Please enter an int number");
			arr[i]=scanner.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
		System.out.println("Sum of all the numbers from the Array is "+sum);
		
	}

}
