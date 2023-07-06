package com.javab5.java.oops.abstraction.jdk8.interfaces.types;

public class Main {
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.enjoy();

		Animal cow = new Animal() {// Anonymous inner class

			@Override
			public void eats() {
				System.out.println("this is herbivore");

			}
		};

		Animal dog = () -> {// Lambda Expression/fn | just a implementation for Functional interface
			System.out.println("Dog eats meat and rice");
		};

	}

}

class Lion implements Animal {// normal implmentation

	@Override
	public void eats() {
		System.out.println("LION is a cranivore");

	}

}
