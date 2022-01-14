package com.example.demo.sec2;

class InvalidAgeException2 extends Exception {
	InvalidAgeException2(String message) {
		super(message);
	}
}

class Person {
	int age;
	void setAge(int age) throws InvalidAgeException2 {
		if(age < 0) {
			throw new InvalidAgeException2("年齢にマイナスの値が指定されました");
		}
		this.age = age;
	}
}

public class ExceptionExample3 {

	public static void main(String args[]) {
		Person p = new Person();
		try {
			p.setAge(-5);
		} catch(InvalidAgeException2 e) {
			System.out.println(e);
		}
	}
}
