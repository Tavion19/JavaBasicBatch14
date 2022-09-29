package com.syntax.class01;

public class NestedIfVsLogicalAndSept8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean programmer=true;
		boolean manualTester=true;
		boolean knowFramework=true;
		
		if(programmer) {
			if(manualTester) {
				
				if(knowFramework) {
					System.out.println("You can be an automation engineer");
				}else {
					System.out.println("You must know a programming language, manual testing");
				}
			}
		}
	}

}
