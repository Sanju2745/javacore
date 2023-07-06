package com.javab5.java.oops.basics;

public class Main {
	public static void main(String[] args) {
		
//		Is Java 100% Object oriented  ?//No
		
		int x=9;//local variables and x is local to main method
		Bike b1 = new Bike();//one object of bike is ready
		
		b1.brand= "Honda";
		Bike b2 = new Bike();//one object of bike is ready
		Bike b = b2;
		b2.brand="Aprillia";
		b2=null;
		Bike b3 = new Bike();//one object of bike is ready
		Bike b4 = new Bike();//one object of bike is ready
		new Bike();
		b1.color="Red";
		b1.speed=78.4f;
		b1.kmsTravelled = 7676788;
		
		System.out.println(b1.color);
		System.out.println(b1.speed);
//		System.out.println(x);// cte error

		System.gc();
		b1.stunt();
		System.out.println("KMs Run  " + b1.movedKilometers());
		System.out.println(b1.brand);
		System.out.println(b2.brand);

	}
}
