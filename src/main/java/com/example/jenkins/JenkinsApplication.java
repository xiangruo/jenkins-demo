package com.example.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class JenkinsApplication {

  public static void main(String[] args) {
    SpringApplication.run(JenkinsApplication.class, args);
  }


  @GetMapping("/hello")
  public @ResponseBody  String hello(){

    return "jenkins";
  }

}
