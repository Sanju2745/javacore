package com.javab5.java.oops.abstraction.jdk8.interfaces;

public interface Bus {

	default void getTypeOfBus(int x) {
		switch (x) {
		case 1:
			System.out.println("SCHOOL BUS");
			break;
		case 2:
			System.out.println("PUBLIC BUS");
			break;
		case 3:
			System.out.println("ARMY BUS");
			break;
		default:
			System.out.println("ILLEGAL input");
			break;
		}

	}

}
