package com.example.demo.sec6;

public class InnerClassExamplel {
  public static void main(String[] args) {
    class Person implements SayHello {
      public void hello() {
        System.out.println("こんにちは");
      }
    }
    Person p = new Person();
    Greeting.greet(p);
  }
}
