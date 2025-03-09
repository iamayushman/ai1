package com.ayu.ai_1.threds.multi.threading;

public class NumberCounter extends Thread {

  @Override
  public void run() {
    int count = 0;
    for (int i = 0; i < 500000000; i++) {
      if (i % 10 == 7) {
        count++;
      }
    }
    System.out.println("Count: " + count);
  }
}
