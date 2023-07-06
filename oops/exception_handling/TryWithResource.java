package com.javab5.java.oops.exception_handling;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);//the resource should be a child AutoCloseable
				
				) {//try with resource
			String next = scanner.next();
			System.out.println(next);
			System.out.println(9 / 0);
		}
		
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		finally {
//			scanner.close();
//		}

	}

}
