package com.learning.springCloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.learning.springCloud.mapper")
public class Payment8801Application {

    public static void main(String[] args) {
        SpringApplication.run(Payment8801Application.class, args);
    }

}
