package com.ayu.ai_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ai1Application {

  public static void main(String[] args) {
    SpringApplication.run(Ai1Application.class, args);
  }
}
