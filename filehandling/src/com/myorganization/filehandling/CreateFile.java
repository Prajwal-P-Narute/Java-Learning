package com.myorganization.filehandling;

import java.io.File;
import java.io.IOException;

class CreateFile {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/pratikpandurangnarute/files/demo.txt");
		
		boolean created = file.createNewFile();
		if(created) {
			System.out.println("file is created");
		}
		else
			System.out.println("file already exists");

	}

}
