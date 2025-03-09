package com.ayu.ai_1.controllers;

import com.ayu.ai_1.config.UserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class ClientController {

  private final UserClient userClient;

  public ClientController(UserClient userClient) {
    this.userClient = userClient;
  }

  @GetMapping("/")
  public String getApiData() {
    return userClient.getUserName();
  }
}
