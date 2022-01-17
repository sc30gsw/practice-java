package com.example.demo.sec5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Book implements Comparable<Book> {
  String title;
  String author;
  int price;

  Book(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  public int compareTo(Book b) {
    return this.price - b.price;
  }

  public static void main(String[] args) {
    List<Book> bookList = new LinkedList<>();
    bookList.add(new Book("7つの習慣", "スティーブン", 1500));
    bookList.add(new Book("無理ゲー社会", "橘玲", 1000));
    bookList.add(new Book("超客観力", "メンタリストDaiGo", 1600));

    Collections.sort(bookList);

    for(Book b : bookList) {
      System.out.println(b.title + ": " + b.author + " 価格:" + b.price);
    }
  }
}
