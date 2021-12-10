package com.learning.springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderZkController
 * @Description Zookeeper消费者controller类
 * @Author zhumengren
 * @Date 2021/12/10 17:04
 * @Email zhumengren@sinosoft.com.cn
 * @Version 1.0
 **/
@RestController
@RequestMapping("/consumer/payment")
@Slf4j
public class OrderZkController {

    public static final String INVOKE_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/zk")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }
}
