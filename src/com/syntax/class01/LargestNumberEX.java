package com.syntax.class01;

public class LargestNumberEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n1 = 10;
		int n2 = 10;
		int n3 = 10;
		int largest = 0;
		
		if (n1>n2 && n1>n3) {
			largest = n1;
		}else if (n2>n3 && n2>n1) {
			largest = n2;
		
		}else if (n3>n1 && n3>n2) {
			largest = n3;
		}
		if(largest!=0) {
			
			if(largest%2==0) {
				System.out.println(largest+" is even number");
			}else {
				System.out.println(largest+" is oodd number");
			}
		}
	}

}
