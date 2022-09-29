package com.syntax.class01;

public class NestedForLoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 *  (I can do write the code 5 separate times... 
		 *  System.out.println();for(int i=1; i<=5; i++);
		 *  
		 */
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+" ");
		}
		System.out.println();
		for(int i=1; i<=5; i++);{
			
		
			{
		System.out.println("-------------------------");
			}
		
		
		int j = 0;
		for (int i=1; j<5; j++) {
			
			for(int in=1;i<=5;i++) {
				System.out.println(i+" ");
				
			}
			System.out.println();
		}
		
}
}
}