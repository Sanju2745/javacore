package com.javab5.java.oops.abstraction;

public class Main {

	public static void main(String[] args) {
		YesBank joseph = new YesBank(500, "Joseph", 896969);
		joseph.checkBalance();
		joseph.deposit(1000);
		joseph.withdrawl(2000);

	}

}
