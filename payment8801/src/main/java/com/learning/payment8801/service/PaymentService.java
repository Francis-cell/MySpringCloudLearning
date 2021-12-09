package com.learning.payment8801.service;

import com.learning.payment8801.pojo.Payment;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhumengren
 * @since 2021-12-08
 */
public interface PaymentService {
    // 新建一条数据
    public int create(Payment payment);
    // 通过payment的id查询payment对象
    public Payment getPaymentById(Long id);
}
