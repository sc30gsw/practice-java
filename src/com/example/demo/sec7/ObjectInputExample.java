package com.example.demo.sec7;

import java.io.*;

public class ObjectInputExample {
  public static void main(String[] args) {
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(in);
    System.out.println("名前を入力してください");

    try {
        String name = reader.readLine();
        if (name != null || name != "") {
          FileInputStream fs = new FileInputStream("/Users/" + name + "/java/test.txt");
          ObjectInputStream os = new ObjectInputStream(fs);
          Triangle tri = (Triangle) os.readObject();
          os.close();
          System.out.println(tri.p0.x + "," + tri.p0.y);
          System.out.println(tri.p1.x + "," + tri.p1.y);
          System.out.println(tri.p2.x + "," + tri.p2.y);
        }
    } catch (IOException e) {
      System.out.println(e);
    } catch (ClassNotFoundException e) {
      System.out.println(e);
    }
  }
}