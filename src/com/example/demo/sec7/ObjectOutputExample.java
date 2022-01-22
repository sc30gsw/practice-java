package com.example.demo.sec7;

import java.io.*;

class Point implements Serializable {
  int x;
  int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Triangle implements Serializable {
  Point p0;
  Point p1;
  Point p2;
}

public class ObjectOutputExample {
  public static void main(String[] args) {
    Triangle tri = new Triangle();
    tri.p0 = new Point(0, 0);
    tri.p1 = new Point(10, 0);
    tri.p2 = new Point(5, 10);

    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(in);
    System.out.println("名前を入力してください");
   

    try {
      String name = reader.readLine();
      if (name != null || name != "") {
        FileOutputStream fs = new FileOutputStream("/Users/" + name + "/java/test.txt");
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(tri);
        os.close();
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
