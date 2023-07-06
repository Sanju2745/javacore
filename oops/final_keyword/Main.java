package com.javab5.java.oops.final_keyword;

class Main2 {
	public static void main(String[] args) {
		System.out.println("Main 2");
	}
}

public class Main {

	public static void main() {
		System.out.println("dummy main");

	}

	public static void main(String[] args) {

//		Final keyword with local varibles
		final int noOfStates = 30;// final variales cannot be changed;
//		noOfStates = 20;

		final float PI;
		PI = 3.14F;
//		PI =  4.323f;

		Student michael = new Student("Michael", 01);
		System.out.println(michael);

	}

}
