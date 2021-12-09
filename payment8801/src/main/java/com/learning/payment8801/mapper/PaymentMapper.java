package com.learning.payment8801.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learning.payment8801.pojo.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhumengren
 * @since 2021-12-08
 */
@Repository
public interface PaymentMapper extends BaseMapper<Payment> {

    @Insert("Insert into db2021.payment (SERIAL) values (#{payment.serial})")
    public int createPayment(@Param("payment") Payment payment);
}
