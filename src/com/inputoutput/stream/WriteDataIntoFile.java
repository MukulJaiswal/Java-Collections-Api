package com.inputoutput.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataIntoFile {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/Users/Mukul/Desktop/input.txt");

		String s = "Welcome to javaTpoint.123";
		byte b[] = s.getBytes();// converting string into byte array
		fos.write(b);
		fos.close();
		System.out.println("success...");
	}
}
