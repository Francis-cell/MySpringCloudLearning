package com.learning.springCloud.controller;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author zhumengren
 * @Date 2021/12/10 17:59
 * @Email zhumengren@sinosoft.com.cn
 * @Version 1.0
 **/

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/consul/getPort")
    public String paymentConsul() {
        return "SpringCloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
    }


}
