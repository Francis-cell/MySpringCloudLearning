package com.learning.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudConsumerOreder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOreder80Application.class, args);
    }

}
