package com.learning.springCloud.controller;

import cn.hutool.core.lang.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author zhumengren
 * @Date 2021/12/10 16:21
 * @Email zhumengren@sinosoft.com.cn
 * @Version 1.0
 **/
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    /**
     * @Author zhumengren
     * @param
     * @Date 2021/12/10 16:26
     * @Description 获取当前服务的端口号以及UUID
     */
    @GetMapping("/zk")
    public String paymentzk() {
        return "springCloud with Zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
