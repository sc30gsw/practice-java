package com.example.demo.sec3;

class Bank {
	static int money = 0;
	
	static void addOnYen() {
		money ++;
	}
}

class Customer extends Thread {
	
	public void run() {
		for (int i = 0; i < 10000; i ++) {
			Bank.addOnYen();
		}
	}
}

public class MultiThreadExample {

	public static void main(String[] args) {
		Customer[] customers = new Customer[100];
		for (int i = 0; i < 100; i ++) {
			customers[i] = new Customer();
			customers[i].start();
		}
		
		for (int i = 0; i < 100; i ++) {
			try {
				customers[i].join();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
		System.out.println(Bank.money);
	}
}
