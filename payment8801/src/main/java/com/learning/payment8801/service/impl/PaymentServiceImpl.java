package com.learning.payment8801.service.impl;

import com.learning.payment8801.mapper.PaymentMapper;
import com.learning.payment8801.pojo.Payment;
import com.learning.payment8801.service.PaymentService;
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
    public int create(Payment payment) {
        int insert = paymentMapper.insert(payment);
        if (insert != 0) {
            System.out.println("插入数据成功！");
        } else {
            System.out.println("插入数据失败！");
        }
        return insert;
    }

    @Override
    public Payment getPaymentById(Long id) {
        System.out.println("Service层执行开始！");
//        id = 1L;
        Payment payment = paymentMapper.selectById(id);
        System.out.println("payment的值为： " + payment);
        if (payment != null && !payment.equals("")) {
            System.out.println("查询数据成功！");
        }
        return payment;
    }
}
