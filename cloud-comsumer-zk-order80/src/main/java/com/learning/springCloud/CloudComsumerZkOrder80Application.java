package com.learning.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudComsumerZkOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudComsumerZkOrder80Application.class, args);
    }

}
