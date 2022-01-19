package com.example.demo.sec6;

interface SayHello {
  public void hello();
}

class Greeting {
  static void greet(SayHello s) {
    s.hello();
  }
}


class Person implements SayHello {
  public void hello() {
    System.out.println("こんにちは");
  }
}

public class SimpleExample {
  public static void main(String[] args) {
    Person p = new Person();
    Greeting.greet(p);
  }
}
