package com.java5.advance.io;

import java.io.File;
import java.util.Scanner;

public class ReadAFile {

	public static void main(String[] args) {
		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB5\\src\\notes\\sample.txt";

		File file = new File(path);

		try (Scanner scanner = new Scanner(file);) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
