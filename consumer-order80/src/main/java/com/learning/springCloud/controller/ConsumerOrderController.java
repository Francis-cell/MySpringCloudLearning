package com.learning.springCloud.controller;

import com.learning.springCloud.entities.CommonResult;
import com.learning.springCloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConsumerOrderController
 * @Description consumer类，配合payment8001使用（下面错写成8801了）
 * @Author zhumengren
 * @Date 2021/12/9 11:04
 * @Email zhumengren@sinosoft.com.cn
 * @Version 1.0
 **/
@RestController
@Slf4j
@RequestMapping("/consumer/payment")
public class ConsumerOrderController {
    public static final String PAYMENT_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/create")
    public CommonResult<Payment> create(Payment payment) {
        System.out.println("成功进入Controller层");
        System.out.println("payment的值为： " + payment);
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}
