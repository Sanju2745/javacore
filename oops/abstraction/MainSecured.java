package com.javab5.java.oops.abstraction;

public class MainSecured {

	public static void main(String[] args) {
//		new SecureBank();//You cannot create objects of abstract class DIRECTLY

//		YesBankSecured manoj = new YesBankSecured(400, "Manoj", 787899);
//		manoj.deposit(78797);
//		System.out.println(manoj);

		SecureBank secureBank = new SecureBank() {//creating the object of abstract class using Annonymouns Inner class

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

		};
	}

}
