package com.learning.springCloud.service.impl;

import com.learning.springCloud.entities.Payment;
import com.learning.springCloud.mapper.PaymentMapper;
import com.learning.springCloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhumengren
 * @since 2021-12-08
 */
@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Payment create(Payment payment) {
        int insert = paymentMapper.createPayment(payment);
        if (insert != 0) {
            log.info("插入数据成功！");
        } else {
            log.info("插入数据失败！");
        }
        return payment;
    }

    @Override
    public Payment getPaymentById(Long id) {
        Payment payment = paymentMapper.selectById(id);
        if (payment != null && !payment.equals("")) {
            log.info("查询数据成功！");
        }
        return payment;
    }
}
