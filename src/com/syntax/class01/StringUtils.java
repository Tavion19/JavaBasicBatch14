package com.syntax.class01;

public class StringUtils {


	void printAllIndexes(String str, char CaptainAmerica) {
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==CaptainAmerica) {
				System.out.println(i);
				
			}
		}
	}

}
