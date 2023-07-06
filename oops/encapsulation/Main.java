package com.javab5.java.oops.encapsulation;

public class Main {

	public static void main(String[] args) {//Design patterns

		
		System.nanoTime();
		
		Student s1 = new Student("John", 8989878765L, "GNL8976");

//		s1.name = "Johnny";
		System.out.println(s1.getName());
		s1.setPanCard("BNKLHU8");
		System.out.println(s1);
//		s1.sayMyName();

	}
}
