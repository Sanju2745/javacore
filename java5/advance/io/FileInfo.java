package com.java5.advance.io;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB5\\src\\notes\\sample.txt";
//		Escape Character = '\'
		
		String x ="\"";
		
		File file = new File(path);
		boolean exists = file.exists();
		System.out.println(file.exists());
		
//		R W
		if(exists) {
			System.out.println("PATH : "+file.getAbsolutePath());
			System.out.println("NAME : "+file.getName());
			System.out.println("R Permission : "+file.canRead());
			System.out.println("W Permission : "+file.canWrite());
		} else
			System.out.println("File is not existing");
		

	}

}
