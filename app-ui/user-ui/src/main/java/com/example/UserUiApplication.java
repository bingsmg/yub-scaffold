package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author weibb
 */
@EnableFeignClients(basePackages = "com.example.feign")
@SpringBootApplication
public class UserUiApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserUiApplication.class, args);
    }
}