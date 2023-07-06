package com.javab5.java.oops.abstraction.jdk8.interfaces;

public class MutilpeInheritanceIssue {
	public static void main(String[] args) {
		new FavouriteDestination().call();
	}
}

interface Mountains {
	default void call() {
		System.out.println("Mountains calling");
	}
}

interface Beaches {
	default void call() {// this should be called
		System.out.println("Beaches call");
	}
}

class FavouriteDestination implements Mountains, Beaches {// TODO
	@Override
	public void call() {
//		System.out.println("Beaches call");
		Beaches.super.call();
	}
}
