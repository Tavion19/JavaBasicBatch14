package com.syntax.class01;

import java.util.Scanner;

public class QUiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		
		char direction = 'N';
		char west = 'W';

		switch(direction) {
		case 'N':
		System.out.println("North");
		break;
		case 'E':
		System.out.println("East");
		break;
		case 'W':
		System.out.println("West");
		break;
		case 'S':
		System.out.println("South");
		}
	}

}
