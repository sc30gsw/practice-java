package com.example.demo.sec10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SimpleClient {
  public static void main(String[] args) {
    try {
      Socket socket = new Socket("127.0.0.1", 8080);
      BufferedReader reader = new BufferedReader(
        new InputStreamReader(socket.getInputStream())
      );
      String message = reader.readLine();
      System.out.println("サーバーから受け取った文字列:" + message);
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
