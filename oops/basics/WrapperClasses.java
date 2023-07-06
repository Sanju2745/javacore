package com.javab5.java.oops.basics;

public class WrapperClasses {

	public static void main(String[] args) {
		int m = 9;
//		float u = 0.8f;

//		Wrapper clases
		Integer x = new Integer(9);
		Float u = new Float(0.8f);
		Boolean a = new Boolean(false);
		Character c = new Character('X');

		Integer x_ = 9;// Auto Boxing
		m = x_;// Auto Unboxing

	}
}
