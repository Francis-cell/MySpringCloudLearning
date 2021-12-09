package com.learning.springCloud.service.impl;

import com.learning.springCloud.entities.Payment;
import com.learning.springCloud.mapper.PaymentMapper;
import com.learning.springCloud.service.PaymentService;
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
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Payment create(Payment payment) {
        int insert = paymentMapper.createPayment(payment);
        if (insert != 0) {
            System.out.println("插入数据成功！");
        } else {
            System.out.println("插入数据失败！");
        }
        return payment;
    }

    @Override
    public Payment getPaymentById(Long id) {
//        System.out.println("Service层执行开始！");
//        id = 1L;
        Payment payment = paymentMapper.selectById(id);
//        System.out.println("payment的值为： " + payment);
        if (payment != null && !payment.equals("")) {
            System.out.println("查询数据成功！");
        }
        return payment;
    }
}
