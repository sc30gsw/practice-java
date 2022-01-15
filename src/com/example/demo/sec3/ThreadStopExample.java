package com.example.demo.sec3;

class MyThread3 extends Thread {
	
	public boolean running = true;
	
	public void run() {
		while(running) {
			System.out.print("*");
		}
		System.out.println("runメソッドを終了します");
	}
}

public class ThreadStopExample {
	
	public static void main(String[] args) {
		MyThread3 t = new MyThread3();
		t.start();
		
		try {
			Thread.sleep(5);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		t.running = false;
	}

}
