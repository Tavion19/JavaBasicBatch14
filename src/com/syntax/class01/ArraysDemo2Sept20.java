package com.syntax.class01;

import java.util.Arrays;

public class ArraysDemo2Sept20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] dresses=new String[] {"Pink Dress", "cocktail","Summer Dress","Pencil Dress","Night Dress","Day Dress"};

		//last index is always size-1 because arrays
		//index starts from zero
		System.out.println(dresses.length);
		
		//MOSTLY THIS IS HOW WE WILL BE USING ARRAYS 
		for(int i=0;i<dresses.length;i++) {
			System.out.println("Lets try "+dresses[i]);

			
		}
		//enhanced for loop
		for(String dress:dresses) {
			System.out.println(dress);
		}
		System.out.println("**************************");
		//prints all the elements of an array without a loop --> )Arrays.toString(dresses))
		System.out.println(Arrays.toString(dresses));
		
	}

}
