package com.syntax.class01;

public class ArrayLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]n= {15, 35, 24, 65, 100};
		
		int largest=n[0];
		
		for(int i=0; i<n.length; i++) {
			if(largest<n[i]) {
				largest=n[i];
			}
		}
		
		System.out.println(largest);
	}

}
