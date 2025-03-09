package com.ayu.ai_1.threds.multi.threading;

public class MultiThreadingExample {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    Thread t1 = new NumberCounter();

    SumCalculator sumCalculator = new SumCalculator();
    Thread t2 = new Thread(sumCalculator);

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println("Time taken: " + (System.currentTimeMillis() - start));
  }
}
