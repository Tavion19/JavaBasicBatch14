package com.syntax.class01;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if class whos object we are creating
		 * is present inside the same package
		 * we don't need to import it
		 */
		
		PhoneHW iphone=new PhoneHW();
		iphone.make="Apple";
		iphone.model="Iphone 14 Pro Max";
		iphone.year=2022;
		iphone.storage=128;
		iphone.makeCall();
		
		//new phone() => to create the object
		PhoneHW samsungPhone=new PhoneHW();
		samsungPhone.model="S22 Ultra";
		samsungPhone.make="Samsung";
		samsungPhone.makeCall();
		
	}
	

}
