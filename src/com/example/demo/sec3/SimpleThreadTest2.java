package com.example.demo.sec3;

class MyRunnalbe implements Runnable {
	public void run() {
		for(int i =0; i < 100; i ++) {
			System.out.println("MyThreadのrunメソッド(" + i + ")");
		}
	}
}

public class SimpleThreadTest2 {
	
	public static void main(String[] args) {
		MyRunnalbe r = new MyRunnalbe();
		Thread thread = new Thread(r);
		thread.start();
		
		for(int i = 0; i < 100; i ++) {
			System.out.println("SimpleThreadTestのmainメソッド(" + i  + ")");
		}
	}

}