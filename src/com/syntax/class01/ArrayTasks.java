package com.syntax.class01;

public class ArrayTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] iceCream= {"vanilla", "chocolate", "pistashio","kulfi","mango"};
		
		//System.out.println("iceCream[0]");
		//System.out.println("iceCream[1]");
		
		//how to get all the values?
		
		for(int i=0; i<=iceCream.length;i++) { //iceCream.length allows you to print all of them
			
			
			System.out.println(iceCream[i]);
		}
		System.out.println("--------------------");
		char [] letters= {'A','B','C','D'};
		
		for(int i=0; i<letters.length;i++) {
			
			System.out.println(letters[i]+" ");
		}
	}

}
