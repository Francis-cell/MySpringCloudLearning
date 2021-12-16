package com.learning.springCloud.service;

import com.learning.springCloud.service.impl.PaymentService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName PaymentHystrixService
 * @Description TODO
 * @Author zhumengren
 * @Date 2021/12/15 10:30
 * @Email zhumengren@sinosoft.com
 * @Version 1.0
 **/
@Component
/** @FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT) */
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentService.class)
public interface PaymentHystrixService {
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
