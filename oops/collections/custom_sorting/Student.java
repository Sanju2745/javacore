package com.javab5.java.oops.collections.custom_sorting;

public class Student implements Comparable<Student> {

	int roll;
	String name;

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student st) {
		if (st.roll == this.roll)
			return 0;
		else if (st.roll < this.roll)
			return 1;
		else
			return -88;

	}

}
