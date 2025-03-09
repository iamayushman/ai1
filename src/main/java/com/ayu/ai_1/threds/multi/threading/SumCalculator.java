package com.ayu.ai_1.threds.multi.threading;

public class SumCalculator implements Runnable {
  @Override
  public void run() {
    int sum = 0;
    for (int i = 0; i < 500000000; i++) {
      sum += i;
    }
    System.out.println("sum = " + sum);
  }
}
