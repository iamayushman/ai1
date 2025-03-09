package com.ayu.ai_1.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "userClient", url = "localhost:8080")
public interface UserClient {

  @GetMapping("/user/")
  String getUserName();
}
