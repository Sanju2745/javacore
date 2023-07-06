package com.javab5.java.oops.abstraction.interfaces;

public class Main {

	public static void main(String[] args) {
		SecureBank john = new SwissBank(1000, "John", 32320);
		john.withdrawl(100);

		HeavenGarden garden = new HeavenGarden();
		garden.getTicket();
		garden.play();

	}

}

class HeavenGarden  extends BowlingAlley implements Garden, PermissibleLand  {

	@Override
	public void play() {
		System.out.println("Playing ...");
	}

	@Override
	public boolean takePermission() {
		return true;
	}

	@Override
	public boolean gardenVisit() {
		return true;
	}

}
