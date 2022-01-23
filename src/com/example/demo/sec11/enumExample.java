package com.example.demo.sec11;

class Student {
  enum Gender { MALE, FEMALE };
  String name;
  Gender gender;
}
public class enumExample {
  public static void main(String[] args) {
    Student s = new Student();
    s.name = "山田太郎";
    s.gender = Student.Gender.MALE;

    System.out.println(s.name + "の性別は" +s.gender.toString());
  }
}
