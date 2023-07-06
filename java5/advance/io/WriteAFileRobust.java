package com.java5.advance.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class WriteAFileRobust {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB5\\src\\notes\\sample.txt";
		String msg = "Hello World!";
		FileOutputStream fos = null;

		fos = new FileOutputStream(path);
		try {
			fos.write(msg.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fos.close();
		}

	}

}
