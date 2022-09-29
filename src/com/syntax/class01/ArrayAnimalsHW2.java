package com.syntax.class01;

public class ArrayAnimalsHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] animals= {"Lion", "Bear", "Elephant", "Monkey", "Tiger"};
		
		for(int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
			
		}
		
		System.out.println();
		System.out.println();
		
		
		String[] animalName= {"Lion", "Bear", "Elephant", "Monkey", "Tiger"};
		
		for(String animal:animalName) {
			System.out.println(animal+" ");
		}
	}

}
