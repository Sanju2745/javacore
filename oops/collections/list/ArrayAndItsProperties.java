package com.javab5.java.oops.collections.list;

import java.util.Arrays;

import com.javab5.java.oops.polymorphism.Shape;

public class ArrayAndItsProperties {
	public static void main(String[] args) {

		int[] m = new int[1000];
		int[] x = { 5, 64, 65, 78, 87, 3 };
		x[0] = 9;
		System.out.println(Arrays.toString(x));
		// L : 6
		// 0,5

		Arrays.sort(x);;
//		PROS
//		Direct Access

//		CONS: 
//		homgenous
//		size fixed
//		can cause memory wastage
//		contigous

		Object[] obj = new Object[3];
		obj[0] = 3;
		obj[1] = "Suman";
		obj[2] = new Shape();
		
		System.out.println(Arrays.toString(obj));

	}

}
