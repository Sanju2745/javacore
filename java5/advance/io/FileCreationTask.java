package com.java5.advance.io;

import java.io.File;
import java.io.IOException;

public class FileCreationTask {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB5\\src\\notes\\new_file.txt";

		File file = new File(path);
		System.out.println("EXISTS : "+file.exists());

		try {
			boolean createNewFile = file.createNewFile();
			System.out.println(createNewFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
