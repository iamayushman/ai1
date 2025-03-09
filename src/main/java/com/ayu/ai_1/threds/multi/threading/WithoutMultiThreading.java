package com.ayu.ai_1.threds.multi.threading;

public class WithoutMultiThreading {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();

    int count = 0;
    for (int i = 0; i < 500000000; i++) {
      if (i % 10 == 7) {
        count++;
      }
    }
    System.out.println("Count: " + count);

    int sum = 0;
    for (int i = 0; i < 500000000; i++) {
      sum += i;
    }
    System.out.println("sum = " + sum);
    System.out.println("Time taken: " + (System.currentTimeMillis() - start));
  }
}
