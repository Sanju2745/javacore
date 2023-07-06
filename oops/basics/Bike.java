package com.javab5.java.oops.basics;

public class Bike {

//	has (instance variables) = instance is a formal word for Object
	String brand = "Royal Enfield";
	
//	default value
	String color;//objects will have default instance variable value as null
	String model;//null
	int price;
	int power;
	int kmsTravelled;//0
	float speed;//0.0

//	does (functions - methods)
	void ride() {
		System.out.println("The bike of" + brand + " rides well");
	}

	int movedKilometers() {
		return kmsTravelled;
	}

	void stunt() {
		System.out.println("The bike " + model + " is nort maed for stunt");
	}

}
