package com.example.demo.sec10;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
  public static void main(String[] args) {
    try {
      ServerSocket serverSocket = new ServerSocket(8080);
      while(true) {
        Socket socket = serverSocket.accept();
        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        writer.println("こんにちは。私はサーバーです。");
        writer.close();
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
