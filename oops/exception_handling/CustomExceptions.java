package com.javab5.java.oops.exception_handling;

import java.util.Scanner;

public class CustomExceptions {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter your voting AGE");
			int age = sc.nextInt();

			if (age < 18) {
				UnderAge underAge = new UnderAge("You are too young to vote");// creating a exception object
				throw underAge;// throwing the same thing
			} else {
				System.out.println("You are eligible for voting");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

//voting (age < 18) UnderAge Exception
class UnderAge extends Exception {// 1 create a class extending Exception

	public UnderAge(String message) {// 2 initialize the constructor
		super(message);
	}

}
