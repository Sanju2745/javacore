package com.java5.advance.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInAFile {

	public static void main(String[] args) {
		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB5\\src\\notes\\sample.txt";
		File file = new File(path);
		boolean exists = file.exists();
		boolean createNewFile = false;
		if (!exists) {
			try {
				createNewFile = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("New File Created : " + createNewFile);

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(path);
			fileWriter.write("Java is Easy !!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
