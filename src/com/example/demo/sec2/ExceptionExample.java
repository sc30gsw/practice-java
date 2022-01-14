package com.example.demo.sec2;

class SimpleClass {
	void doSomething() {
		int array[] = new int[3];
		array[10] = 99;
		System.out.println("doSometihngメソッドを終了します");
	}
}
public class ExceptionExample {
	public static void main(String args[]) {
		SimpleClass obj = new SimpleClass();
		try {
			obj.doSomething();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外をキャッチしました");
			
			//メソッドの呼び出し履歴を出力
			e.printStackTrace();
		}
	}

}
