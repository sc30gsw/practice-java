package com.example.demo.sec11;

class Student2 {
  enum Gender { MALE, FEMALE, UNKNOWN };
  String name = "匿名";
  Gender gender = Gender.UNKNOWN;

  public boolean equals(Object s) {
    Student2 student = (Student2) s;
    return (this.name == student.name && this.gender == student.gender);
  }
}

public class StudentEnumExample {
    public static void main(String[] args) {
      Student2 s1 = new Student2();
      Student2 s2 = new Student2();

      System.out.println(s2.equals(s1));
    }
}
