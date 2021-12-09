package com.learning.payment8801;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.learning.payment8801.mapper")
public class Payment8801Application {

    public static void main(String[] args) {
        SpringApplication.run(Payment8801Application.class, args);
    }

}
