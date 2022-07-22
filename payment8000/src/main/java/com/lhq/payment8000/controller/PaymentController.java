package com.lhq.payment8000.controller;

import cn.hutool.core.util.ObjectUtil;
import com.lhq.cloudapicommons.entity.CommonResult;
import com.lhq.cloudapicommons.entity.Payment;
import com.lhq.payment8000.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lianghanqiang
 * @CLass PaymentController
 * @create 2022/7/21
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        CommonResult commonResult = new CommonResult();
        if (ObjectUtil.isNotEmpty(payment)) {
            Boolean succ = paymentService.create(payment);
            if (succ) {
                commonResult = new CommonResult(200, "创建成功");
            } else {
                commonResult = new CommonResult(700, "创建失败");
            }
        } else {
            commonResult = new CommonResult(800, "参数不能为空");
        }
        return commonResult;
    }


    @GetMapping("/getPaymentById")
    public CommonResult<Payment> getPaymentById(Long id) {
        return new CommonResult(200,"成功", paymentService.getPaymentById(id));
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
