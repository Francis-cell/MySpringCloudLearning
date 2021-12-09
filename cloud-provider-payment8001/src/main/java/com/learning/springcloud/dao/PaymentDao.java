package com.learning.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learning.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao extends BaseMapper<Payment> {
}
