package com.myorganization.filehandling;

import java.io.File;

class FileProperties {

	public static void main(String[] args) {
		File file = new File("/Users/pratikpandurangnarute/files/demo.txt");
		
		if(file.exists()) {
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(file.length());
			
			if(file.canExecute())
				System.out.println("file is executable");
			else
				System.out.println("file is not executable");
			
			if(file.canWrite())
				System.out.println("file is writable");
			else
				System.out.println("file is not writable");
			
			if(file.canRead())
				System.out.println("file is readable");
			else
				System.out.println("file is not readable");
		}
		else
			System.out.println("file does not exists");

	}

}
