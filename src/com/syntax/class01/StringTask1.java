package com.syntax.class01;

public class StringTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userName="user1";
		String password="pass123";
		String confirmPassword="pass123";
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}else if(password.length()<8) {
			System.out.println("Password is too short");
		}else if(password.contains(userName)) {
			System.out.println("Password cannot contain username");
		}else if(password.equals(confirmPassword)) {
			System.out.println("Passwords do not match");
			
		}else {
			System.out.println("Your username and password has been created");
		}
				
	}

}
