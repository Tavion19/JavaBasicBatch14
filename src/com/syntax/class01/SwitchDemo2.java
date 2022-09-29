package com.syntax.class01;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//matching cases must be of same data type as a variable
		//no duplicate case in switch
		
		char choice='Y';
		String answer;
		
		switch(choice) {
		
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
		default:
				answer="Unknown";
				break;
		}
		System.out.println(answer);
	}

}
/*
 * switch case cannot use logical operators
 * switch case cannot use relational operators
 */

/*
 * CANNOT work with boolean values
 * CE: Cannot switch on a value of type boolean
 * boolean boo=true;
 * 
 * 
 * switch(boo){
 * }
 * 
 * CANNOT work with float/double and long
 * 
 */
