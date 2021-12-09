package com.learning.springCloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learning.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhumengren
 * @since 2021-12-08
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

    @Insert("Insert into db2021.payment (SERIAL) values (#{payment.serial})")
    public int createPayment(@Param("payment") Payment payment);
}
