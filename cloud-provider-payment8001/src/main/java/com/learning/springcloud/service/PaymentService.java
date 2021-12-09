package com.learning.springcloud.service;

import com.learning.springcloud.entities.Payment;

public interface PaymentService {
    // 新建一条数据
    public int create(Payment payment);
    // 通过payment的id查询payment对象
    public Payment getPaymentById(Long id);
}
