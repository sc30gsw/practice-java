package com.example.demo.sec6;

interface SimpleInterface {
  public int doSomething(int n);
}

public class LambdaExample {
  static void printout(SimpleInterface i) {
    System.out.println(i.doSomething(2));
  }

  public static void main(String[] args) {
    printout(n -> n + 1);
  }
}
