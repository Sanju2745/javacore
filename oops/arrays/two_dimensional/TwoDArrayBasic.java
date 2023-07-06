package com.javab5.java.oops.arrays.two_dimensional;

import java.util.Arrays;

public class TwoDArrayBasic {

	public static void main(String[] args) {

		int[][] matrix = new int[10][7];

//		System.out.println(Arrays.toString(matrix));

//		for (int i = 0; i < matrix.length; i++) {// 6
//			for (int j = 0; j < matrix[0].length; j++) {
//				System.out.print(matrix[i][j] + "   ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
//		Arrays.sort(matrix);

	}

}
