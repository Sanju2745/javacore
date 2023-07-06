package com.java5.advance.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFileRobust {

	public static void main(String[] args) throws FileNotFoundException {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB5\\src\\notes\\sample.txt";
//		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

		FileInputStream fileInputStream;

		fileInputStream = new FileInputStream(path);
		int readChar = 0;
		try {
			while ((readChar = fileInputStream.read()) != -1) {
				System.out.print((char)readChar);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
