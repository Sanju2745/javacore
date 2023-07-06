package com.java5.revision;

public class BasicDataTypes {// Class name will follow PascalCaseConvention
//RULES : class name and File name is exactly same

	public static void main(String[] args) {

//		Integers in Java

		byte a = 95;// = is called assigmenet operator
		short b = 87;
		int c = 8;
		long d = 8799889898L;//2s complement
//		d = 9;

//		a=c;
//		d=c
//		Float numbers
		float e = 3.14f;//IEEE algo
		double f = 3.14;
		System.out.println(f);

		e = d;//corner case
		System.out.println("--> "+e);

//		boolean
		boolean isJavaEasy = true;// variable names and method names follow camelCaseConvention
		isJavaEasy = false;

		char g = 'A';
		System.out.println(g);

		int x = g;
		System.out.println(x);

		char rupeeSymbol = '₹';
		System.out.println(rupeeSymbol);

	}

}
