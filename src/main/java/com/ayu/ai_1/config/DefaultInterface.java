package com.ayu.ai_1.config;

public interface DefaultInterface {

  static void read(){

  }
  static void read2(){

  }
  static void read3(){

  }
  static void read4(){

  }

  default void myName() {
    System.out.println("My name is Ayushman");
  }

  default String myAge(String age, String gender) {
    return age + " " + gender;
  }
}

