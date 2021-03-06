package com.learning.springCloud.service;

import com.learning.springCloud.entities.Payment;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhumengren
 * @since 2021-12-08
 */
public interface PaymentService {
    /** 新建一条数据 */
    public Payment create(Payment payment);

    /** 通过payment的id查询payment对象 */
    public Payment getPaymentById(Long id);
}
