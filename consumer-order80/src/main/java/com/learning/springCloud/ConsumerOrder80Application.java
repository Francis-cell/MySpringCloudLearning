package com.learning.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrder80Application.class, args);
    }

}
