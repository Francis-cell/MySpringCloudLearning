package com.learning.springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderConsulController
 * @Description Consul Controller测试方法
 * @Author zhumengren
 * @Date 2021/12/13 9:38
 * @Email zhumengren@sinosoft.com.cn
 * @Version 1.0
 **/
@RestController
@RequestMapping("/consumer/consul")
@Slf4j
public class OrderConsulController {
    private static final String INVOKE_URL = "http://consul-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consul/getPort")
    public String payment() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul/getPort", String.class);
    }
}
