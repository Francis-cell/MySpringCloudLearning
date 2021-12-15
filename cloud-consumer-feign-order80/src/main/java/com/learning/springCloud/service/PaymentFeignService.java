package com.learning.springCloud.service;

import com.learning.springCloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName PaymentFeignService
 * @Description TODO
 * @Author zhumengren
 * @Date 2021/12/14 14:22
 * @Email zhumengren@sinosoft.com
 * @Version 1.0
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE") // 使用OpenFeign
public interface PaymentFeignService {
    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout();
}
