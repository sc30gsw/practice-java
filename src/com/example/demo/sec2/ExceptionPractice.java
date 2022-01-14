package com.example.demo.sec2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionPractice {
	
	static void methodA() throws FileNotFoundException {
		FileReader fr = new FileReader("test.txt");
	}
	
	public static void main(String args[]) {
		try {
			methodA();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
