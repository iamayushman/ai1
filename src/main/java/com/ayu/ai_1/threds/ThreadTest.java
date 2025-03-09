package com.ayu.ai_1.threds;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ThreadTest {
  public static void main(String[] args) {

    List<Integer> counter = IntStream.range(0, 100).boxed().toList();

    ExecutorService executor = Executors.newCachedThreadPool();
    Instant start = Instant.now();
    List<CompletableFuture<String>> futures =
        counter.stream()
            .map(item -> CompletableFuture.supplyAsync(() -> processItem(item), executor))
            .toList();

    List<String> list = futures.stream().map(CompletableFuture::join).toList();
    executor.shutdown();
    System.out.println(list);
    Instant end = Instant.now();
    System.out.println("=========================");
    System.out.println("=========================");
    System.out.println("=========================");
    System.out.println("=========================");
    System.out.println("Elapsed time: " + (Duration.between(start, end).toMillis()));

    Instant start2 = Instant.now();
    List<String> list2 = counter.stream().map(ThreadTest::processItem).toList();
    System.out.println(list2);
    Instant end2 = Instant.now();
    System.out.println("Elapsed time: " + (Duration.between(start2, end2).toMillis()));
  }

  private static String processItem(Integer item) {
      try {
          Thread.sleep(100);
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
      return item.toString();
  }
}
