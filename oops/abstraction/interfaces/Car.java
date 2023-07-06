package com.javab5.java.oops.abstraction.interfaces;

//JDK 9 also support private method
public interface Car {

	// abstract method
	int getTopSpeed();

//	 JDK 8 static methods in interface
	static void haveService() {
		System.out.println("//SERVICING//");
	}

//	default methods in JDK 8
	default void haveRepairing() {
		System.out.println("//REPAIRING//");
	}

}
