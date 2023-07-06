package com.java5.advance.io;

import java.io.File;

public class FileDeletion {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB5\\src\\notes\\sample.txt";
//		Escape Character = '\'
		
		String x ="\"";
		
		File file = new File(path);
		System.out.println(file.exists());
		
		boolean delete = file.delete();
		System.out.println("DELETED ? "+ delete);
		

	}

}
