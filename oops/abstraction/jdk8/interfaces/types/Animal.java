package com.javab5.java.oops.abstraction.jdk8.interfaces.types;

@FunctionalInterface//A functional interface is an interface with ONLY one abstract method
public interface Animal {
	
//	void sleeps();
	
	void eats();
	
	default void enjoy() {// abstract ==> no body
		System.out.println("Enjoying");
	}

}
