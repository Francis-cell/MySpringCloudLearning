package com.learning.springcloud.service.impl;

import com.learning.springcloud.dao.PaymentDao;
import com.learning.springcloud.entities.Payment;
import com.learning.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        int insert = paymentDao.insert(payment);
        if (insert != 0) {
            System.out.println("插入数据成功！");
        } else {
            System.out.println("插入数据失败！");
        }
        return insert;
    }

    @Override
    public Payment getPaymentById(Long id) {
        Payment payment = paymentDao.selectById(id);
        if (payment != null && !payment.equals("")) {
            System.out.println("查询数据成功！");
        }
        return payment;
    }
}
