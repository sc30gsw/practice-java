package com.example.demo.sec7;

import java.io.*;

public class FileWriteExample {
  public static void main(String[] args) {
    try {
      //Windowsの場合Fileの引数は"C(D):/java/text.txt"となる
      File file = new File("/java/test.txt");
      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);
      for (int i = 0; i < 5; i ++)  {
        bw.write("[" + i + "]");
        bw.newLine();
      }
      bw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
