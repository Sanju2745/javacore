package com.javab5.java.oops.constructors;

public class Animal {// instances = objects

	String nameOfSpecies;
	String habitat;
	boolean isEndangered;

	// No method in java can exist without any return type
	public String toString() {
		return "Animal [nameOfSpecies=" + nameOfSpecies + ", habitat=" + habitat + ", isEndangered=" + isEndangered
				+ "]";
	}

	// No method in Java can exist without a return type
	void aniamlCount() {
		System.out.println("Counting the animal");
	}

	Animal() {// Constructor (ParameterLess constructor)
		System.out.println("Animal() called");
	}
	
	Animal(boolean dangered) {// Constructor (ParameterLess constructor)
		this();
		System.out.println("Animal(single parameter) called");
	}

	public Animal(String nameOfSpecies, String habitat, boolean isEndangered) {//Parameterized Constructor
		this(isEndangered); //chaining should always be the 1st statement
//		this();//Constructor Chaining
		System.out.println("Animal(Parameetrized)");
		this.nameOfSpecies = nameOfSpecies;//Shadow Problem
		this.habitat = habitat;
		this.isEndangered = isEndangered;
	}

//	JVM will check : 0 ===> Create a default constructor
//	JVM will check : 1 ===> NOT Create a default constructor

}
