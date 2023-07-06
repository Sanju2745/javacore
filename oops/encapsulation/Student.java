package com.javab5.java.oops.encapsulation;

//Access Specifiers | static

//private Constuctors

public class Student {// private default protected public

	private String name;
	long phoneNumber;
	private String panCard;

	//Controled Access using Getters and Setters
	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getName() {
		return name;
	}

	private void sayMyName() {
		String name = "";
		System.out.println("Name : " + this.name);
	}

	 Student(String name, long phoneNumber, String panCard) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.panCard = panCard;
		sayMyName();
	}

	public String toString() {
		return "Student [name=" + name + ", phoneNumber=" + phoneNumber + ", panCard=" + panCard + "]";
	}

}
