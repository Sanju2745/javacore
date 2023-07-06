package com.javab5.java.oops.abstraction.interfaces;

public interface SecureBank {// you will achieve 100% abstraction

	String IFSC = "SEC789";// by default it will always be final and static

	boolean withdrawl(int amount);// abstract methods are methods without the body

	abstract boolean deposit(int amount);// abstract keyword is optional in interface

	void checkBalance();// you cannot have NORMAL concrete methods inside an interface

}
