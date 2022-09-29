package com.syntax.class01;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * type casting => type = data type casting= converting
		 * converting one data type to another
		 */
		
		byte box1=127; // smallest box
		short box2=3333; // slightly large box
		int box3=45454545; // large box most commonly used
		long box4=454545455; //slightly larger box ;
		float box5=41564545; // larger box
		double box6=454545454; // largest box
		
		int number=(int)15.2; //we can't store the decimal number in a box of type double
		System.out.println(number);
		
		byte smallerBox=(byte)box2;
		System.out.println(smallerBox);
		
		short biggerbox=box1;
		
		long box7=box1; //we can do this because box 7 is larger than box 1
		
		//as box6 is larger it is double we need type casting to assign value
		float box8=(float)box6;
		
		char a=(char)67;
		System.out.println(a);
		
		//int box9=box4; //No; had to fix it.
		int box9=(int)box4;
		System.out.println(box9);
		
		
		
	}

}
