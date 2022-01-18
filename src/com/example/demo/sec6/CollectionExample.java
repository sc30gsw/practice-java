package com.example.demo.sec6;

import java.util.ArrayList;

class Point {
  int x;
  int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  void printInfo() {
    System.out.println("(" + this.x + "," + this.y + ")");
  }
}
public class CollectionExample {
  public static void main(String[] args) {
    ArrayList<Point> pointList = new ArrayList<>();
    pointList.add(new Point(0, 8));
    pointList.add(new Point(1, 6));
    pointList.add(new Point(2, 9));
    pointList.add(new Point(3, 3));

    // for (Point p : pointList) {
    //   p.x *= 2;
    //   p.y *= 2;
    // }

    pointList.forEach(p -> { p.x *=2; p.y *=2; });

    // for (Point p : pointList) {
    //   p.printInfo();
    // }

    pointList.forEach(p -> p.printInfo());
  }
}
