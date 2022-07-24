package com.lhq.cloudproviderpayment8001.dao;

import com.lhq.cloudapicommons.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lianghanqiang
 * @CLass PaymentDao
 * @create 2022/7/21
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);


    public Payment getPaymentById(@Param("id") Long id);
}
