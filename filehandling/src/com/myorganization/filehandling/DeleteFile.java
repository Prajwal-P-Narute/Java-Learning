package com.myorganization.filehandling;

import java.io.File;

class DeleteFile {

	public static void main(String[] args) {
		File file  = new File("/Users/pratikpandurangnarute/files/demo.txt");
		
		if(file.exists()) {
			boolean deleted = file.delete();
			
			if(deleted)
				System.out.println("file is deleted");
			else
				System.out.println("something went wrong");
		}
		else
			System.out.println("File does not exists");

	}

}
