package com.syntax.class01;

public class IfElse {

	public static void main(String[] args) {

		
		short box=167;
		byte box2=(byte)box;
		System.out.println(box2);
		/*
		 * What is type casting?
		 * type casting is converting one data type to another data type
		 * Why should I learn about type casting?
		 * So that we can use the code that is written by someone else to make our life easier
		 * or when we will be working in teams we will be able to merge the code
		 * What is the syntax for type casting?
		 * When we are converting something smaller to larger we don't need to do anything
		 * It happens automatically, we just assign the variable for example
		 * 
		 * int bov=1234
		 * 
		 * long box2=box; // this is how it works and it is called implicit or widening automatically
		 * 
		 * however when we convert a larger data to a smaller data type
		 * then this is how we do it
		 * 
		 * long box=1245454;
		 * 
		 * int box2=(int) box; narrowing ot explicit or manual conversion 
		 * 
		 */
		
		double money=5;
		boolean isHungry=true;
		double kfcBurger=11;
		
		if(money>kfcBurger) {
			System.out.println("yay I can enjot a burger");
		}
		
		else
		
		{
			System.out.println("I should make something at home");
		}
		
		if(true) {
			System.out.println("If block");
		}else {
			System.out.println("else block");
		}
		
		boolean isHungryy=true;
		
		if(isHungryy) {
			System.out.println("Lets eat something yummy");
		
		}else {
			System.out.println("Lets watch and do some coding from Youtube");
				
				
		}
		
	}

}
