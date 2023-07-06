package com.javab5.java.oops.abstraction;

//0-100% Abstraction
public abstract class SecureBank {// if a class is having any abstract methods , it is your duty to make the
									// class abstract

	int balance;
	String name;
	int acNo;

	abstract boolean withdrawl(int amount);// abstract methods are methods without the body

	abstract boolean deposit(int amount);

	void checkBalance() {//concrete methods
		System.out.println("Checking your balance ...");
		System.out.println("BALANCE : " + balance);
	}

}
