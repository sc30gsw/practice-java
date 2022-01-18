package com.example.demo.sec6;

public class AnonymousClassExample {
  public static void main(String[] args) {
    Greeting.greet( () -> {
        System.out.println("こんにちは");
      } );
  }
}
