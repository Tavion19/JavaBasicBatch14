package com.syntax.class01;

import java.util.Arrays;

public class ArraysDemo3Sept20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creates an array, store elements in the array
		//then with the help of another array, 
		//adds all the elements
		int size=10;
		int [] arr=new int[10];
		int start=11;
		for(int i=0; i<arr.length;i++) {
			arr[i]=start;
			start--;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("*********************************");
		
		int sum=0;
		for(int num:arr) {
			//sum+=num is another way you can write it below
			sum=sum+num;
		}
		System.out.println(sum);
	}

}
