package com.learning.springCloud.service.impl;

import com.learning.springCloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author 86185
 * @Date 2021/12/16 10:06
 * @Email zhumengren@sinosoft.com
 * @Version 1.0
 **/
@Component
public class PaymentService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "************** paymentInfo_OK 的fallBack方法！";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "************** paymentInfo_TimeOut 的fallBack方法！";
    }
}
