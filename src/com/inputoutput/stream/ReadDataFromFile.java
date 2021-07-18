package com.inputoutput.stream;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromFile {

	static void readSingleCharacter() {
		try {
			FileInputStream fin = new FileInputStream("C:/Users/Mukul/Desktop/input.txt");
			int i = fin.read();

			// This Reads single character that's why while reading data from the file we
			// need an Byte array.
			System.out.println((char) i);

			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	static void completeFile() {
		try {
			byte[] array = new byte[100];

			FileInputStream fin = new FileInputStream("C:/Users/Mukul/Desktop/input.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);

			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) throws IOException {
		readSingleCharacter();
		completeFile();
	}
}