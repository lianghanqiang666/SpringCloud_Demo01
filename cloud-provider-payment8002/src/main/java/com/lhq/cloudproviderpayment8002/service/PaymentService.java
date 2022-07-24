package com.lhq.cloudproviderpayment8002.service;

import com.lhq.cloudapicommons.entity.Payment;

/**
 * @author lianghanqiang
 * @CLass PaymentService
 * @create 2022/7/21
 */
public interface PaymentService {
    public Boolean create(Payment payment);

    public Payment getPaymentById(Long id);
}
