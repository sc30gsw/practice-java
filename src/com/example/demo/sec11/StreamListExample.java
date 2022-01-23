package com.example.demo.sec11;

import java.util.*;

public class StreamListExample {
  public static void main(String[] args) {
    List <String> list = Arrays.asList(
      "January", "February", "March", "April", "May", "June", 
      "July", "August", "September", "October", "November", "December"
    );

    list.stream().
      //中間操作
      filter(s -> s.length() <= 5).
      sorted().
      map(s -> "[" + s + "]").
      //終端操作
      forEach(s -> System.out.println(s));
  }
}
