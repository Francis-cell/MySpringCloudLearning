package com.learning.springCloud.controller;

import com.learning.springCloud.entities.CommonResult;
import com.learning.springCloud.entities.Payment;
import com.learning.springCloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderFeignController
 * @Description TODO
 * @Author 86185
 * @Date 2021/12/14 14:32
 * @Email zhumengren@sinosoft.com
 * @Version 1.0
 **/
@RestController
@RequestMapping("/consumer/feign")
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        CommonResult paymentById = paymentFeignService.getPaymentById(id);
        return paymentById;
    }
}
