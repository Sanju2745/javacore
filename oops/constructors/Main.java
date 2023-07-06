package com.javab5.java.oops.constructors;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		new Scanner(System.in);
//		Animal tiger = new Animal();// one instance/object of Animal - Instantiation
//		A constructor is a special method in the class used for object creation 
//		and initializing default values of instance variables
		
//		A constructor gets called only once while the instatiation
//		tiger.Animal();//Compile Error
		
		
//		tiger.nameOfSpecies = "Royal Bengal Tiger";
//		tiger.habitat = "Jungle";
//		tiger.isEndangered = true;
//		System.out.println(tiger);
		
		Animal peacock = new Animal("Peacock","Natural Reserves", true);
		System.out.println(peacock);
		

	
	}

}
