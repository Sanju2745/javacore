package com.java5.advance.io.serialization;

import java.io.Serializable;

public class Student implements Serializable {

//	Address ad;//this will not be serializable

	static int uan;// statioc things take part in serialization
	public static final long serialVersionUID = 870L;

	transient int id;// transient things don't take part in serialization
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
