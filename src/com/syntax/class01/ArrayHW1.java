package com.syntax.class01;

public class ArrayHW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cars= {"Honda", "Ford", "Toyota", "BMW", "Mitsubishi", "Pontiac"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		
		
		String[] carName= {"Honda", "Ford", "Toyota", "BMW", "Mitsubishi", "Pontiac"};
		
		for (String name:carName) {
			System.out.println(name+ " ");
		}
	}

}
