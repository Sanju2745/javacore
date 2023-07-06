package com.javab5.java.oops.abstraction.jdk8.interfaces;

public class Main {

	public static void main(String[] args) {

		Car.haveService();
		new Ferarri().haveRepairing();
		
		Vehicle vehicle = new Vehicle();
		vehicle.getTypeOfBus(5);
		System.out.println(vehicle.getTopSpeed());
		vehicle.haveRepairing();

	}

}

class Ferarri implements Car {

	@Override
	public int getTopSpeed() {
		return 300;
	}

}

class Vehicle implements Car, Bus {//using interface you can achieve multiple inheritance

	@Override
	public int getTopSpeed() {
		return 200;
	}

}

//class M extends Vehicle{
//	
//}
