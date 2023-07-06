package com.javab5.java.oops.abstraction;

public class YesBankSecured extends SecureBank {

	int balance;
	String name;
	int acNo;

	public YesBankSecured(int balance, String name, int acNo) {
		super();
		this.balance = balance;
		this.name = name;
		this.acNo = acNo;
	}

	@Override
	boolean withdrawl(int amount) {
		if (this.balance >= amount) {
			System.out.println("Withdrawing Money  ...");
			this.balance = this.balance - amount;
			System.out.println("BALANCE : " + balance);
			return true;
		} else {
			System.out.println("You are low of money");
			System.out.println("BALANCE : " + balance);
			return false;
		}
	}

	@Override
	boolean deposit(int amount) {

		if (amount < 0) {
			System.out.println("Negative Amount cannot be deposited");
			return false;
		}

		this.balance += amount;
		System.out.println("Money Deposited ...");
		System.out.println("NEW BALANCE : " + balance);

		return true;
	}

	@Override
	public String toString() {
		return "YesBankSecured [balance=" + balance + ", name=" + name + ", acNo=" + acNo + "]";
	}

}
