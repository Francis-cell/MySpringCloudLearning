package com.learning.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.learning.springcloud.dao")
public class PaymentMain8081 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8081.class, args);
    }
}
