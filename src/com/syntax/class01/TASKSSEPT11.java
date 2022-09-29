package com.syntax.class01;

public class TASKSSEPT11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//from the range of 1 to 50
		//please find the sum of all even and odd numbers
		
		/*
		 * 
		 * 
		 * 
		 */
		int sumOdd = 0;
		int sumEven=0;
		
		for (int I=1; I<=50; I++) {
			if (I % 2 == 0) {
				sumEven+=I;
			}else {
				sumOdd+=I;
			}
		
			System.out.println("SUM OF ODD NUMBERS= "+ sumOdd);
	
		
			System.out.println("SUM OF EVEN NUMBERS= "+ sumEven);

			
		}
	}

}
