package com.example.demo.sec5;

import java.util.ArrayList;

public class WrapperExample {
  public static void main(String[] args) {
    ArrayList<Integer> integerList = new ArrayList<>();
    
    integerList.add(50);
    integerList.add(100);
    int i0 = integerList.get(0);
    int i1 = integerList.get(1);
    System.out.println(i0);
    System.out.println(i1);
  }
}