package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author weibb
 */
@SpringBootApplication
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

//    @Bean
//    public ResourceConfig resourceConfig() {
//        ResourceConfig resourceConfig = new ResourceConfig();
//        resourceConfig.packages("com.example");
//        return resourceConfig;
//    }
}