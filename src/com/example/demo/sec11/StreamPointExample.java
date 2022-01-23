package com.example.demo.sec11;

import java.util.Arrays;

import java.util.*;

class Point{
  int x;
  int y;

  //セッター
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  void printInfo() {
    System.out.println("(" + this.x + "," + this.y + ")");
  }
}

public class StreamPointExample {
  public static void main(String[] args) {
    List<Point> list = Arrays.asList(
      new Point(8, 7), new Point(3, 5), new Point(5, 2),
      new Point(9, 1), new Point(1, 10), new Point(2, 6)
    );

    list.stream().
    filter(s -> 3 < s.x).
    sorted((s0, s1) -> s0.y - s1.y).
    forEach(s -> s.printInfo());
  }
}
