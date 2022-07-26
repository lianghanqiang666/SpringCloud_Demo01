package com.lhq.cloudconsumerorder80.controller;

import com.lhq.cloudapicommons.entity.CommonResult;
import com.lhq.cloudapicommons.entity.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author lianghanqiang
 * @CLass OrderController
 * @create 2022/7/22
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    public static final String PAYMENT_SRV = "http://CLOUD-PROVIDER-PAYMENT";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_SRV+"/payment/create",payment, CommonResult.class);
    }

    @GetMapping("/getPayment/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_SRV+"/payment/getPaymentById?id="+id,CommonResult.class);
    }
}
