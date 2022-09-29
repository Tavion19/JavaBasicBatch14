package com.syntax.class01;

import java.util.Arrays;

public class ArrayGroupProjectQues10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3,8,10,19,24,35,65
		//3,8,10,19,24,35,65
		
		
		int array[]= {3,8,10,19,24,35,65};
		Arrays.sort(array);
		
		System.out.println("Second highest element in the array = "+array[array.length-2]);
		
	}

}
