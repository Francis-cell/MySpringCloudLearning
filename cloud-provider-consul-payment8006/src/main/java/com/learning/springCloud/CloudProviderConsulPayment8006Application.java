package com.learning.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderConsulPayment8006Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderConsulPayment8006Application.class, args);
    }

}
