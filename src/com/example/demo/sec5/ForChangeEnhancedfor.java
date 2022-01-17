package com.example.demo.sec5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForChangeEnhancedfor {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");

    for (int i = 0; i < list.size(); i ++) {
      String str = list.get(i);
      System.out.println(str);
    }

    for (String str : list) {
      System.out.println(str);
    }

    Iterator<String> it = list.iterator();
    while(it.hasNext()) {
      String str = it.next();
      System.out.println(str);
    }
  }
}