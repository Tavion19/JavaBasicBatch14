package com.syntax.class01;

public class Dog {

	// TODO Auto-generated method stub

		//State
		// attributes/ properties/ fields
		
		String name;
		String color;
		String breed;
		double weight;
		int age;
		//These are behaviors of a dog
		//Method functions
		
		void run() {
			System.out.println("Dog is running around backyard.");
		}
		
		void growl() {
			System.out.println("Dog is growling at squirrels.");
		}
		public static void main(String[] args) {
			//creating objects from a class
			//new Dog();=> it creates an object of class dog
			Dog dog1= new Dog();
			// calling a behavior on an object
			dog1.name="Scooby";
			dog1.breed="Pit Bull";
			dog1.color="Blue";
			dog1.weight=10;
			
			System.out.println(dog1.name +" is a "+dog1.breed+" and his color is "+dog1.color);
			
			
	}

}
