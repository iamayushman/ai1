package com.ayu.ai_1;

import com.ayu.ai_1.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @GetMapping("employee/{id}")
  public ResponseEntity<Employee> getEmployee(@PathVariable int id) {
    return new Employee(1,"A");
  }
}
