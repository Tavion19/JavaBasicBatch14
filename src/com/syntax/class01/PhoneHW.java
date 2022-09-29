package com.syntax.class01;

public class PhoneHW {

		// TODO Auto-generated method stub
		/*
		 * 
		 * Create a Class "Phone". Create 3 objects of it: Iphone, Pixel, Samsung 
		 * with specific attributes and behaviors
		 */
		
	
	String make;
	String model;
	String color;
	int year;
	int storage;
	
	void takePictures() {
		System.out.println("Sending a text using "+model);
		
	}
	
	void makeCall() {
		System.out.println("Leaving voicemails with "+model);
		
	}
	
	void browseInternet() {
		System.out.println("Taking pictures with "+model);
	}


}
