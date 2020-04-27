package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

public static void main(String[] args) {
SpringApplication.run(DemoApplication.class, args);
}

@GetMapping("/hello")
public String hello(
  @RequestParam(value = "name", defaultValue = "World") String name,
  @RequestParam(value = "a", defaultValue = "0") String a,
  @RequestParam(value = "b", defaultValue = "0") String b
) {
return String.format("Hello %s!", name)+" a+b="+Tashizan.calc(Integer.valueOf(a),Integer.valueOf(b));
}
}