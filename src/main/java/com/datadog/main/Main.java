package com.datadog.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.datadog")
public class Main {
  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(Main.class);
    application.run(args);
  }
}
