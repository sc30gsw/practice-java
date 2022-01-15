package com.example.demo.sec3;

class MyThread2 extends Thread {
	public void run() {
		for(int i = 0; i < 100; i ++) {
			System.out.println("MyThread2クラスのrunメソッド(" + i + ")");
		}
	}
}
public class SimpleThreadTest3 {
	
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start();
		
		try {
			t.join();
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		
		for(int i = 0; i < 100; i ++) {
			System.out.println("SimpleThreadTest3クラスのmainメソッド(" + i + ")");
		}
	}
	
}
