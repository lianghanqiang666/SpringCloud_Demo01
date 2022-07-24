package com.lhq.cloudproviderpayment8001.service.impl;

import com.lhq.cloudapicommons.entity.Payment;
import com.lhq.cloudproviderpayment8001.dao.PaymentDao;
import com.lhq.cloudproviderpayment8001.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lianghanqiang
 * @CLass PaymentServiceImpl
 * @create 2022/7/21
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Boolean create(Payment payment) {
        int id = paymentDao.create(payment);
        return id > 0 ? true : false;
    }

    @Override
    public Payment getPaymentById(Long id) {
        Payment payment = paymentDao.getPaymentById(id);
        return payment;
    }
}
