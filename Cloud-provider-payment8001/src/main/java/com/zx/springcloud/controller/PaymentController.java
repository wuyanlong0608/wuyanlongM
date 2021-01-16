package com.zx.springcloud.controller;

import com.zx.springcloud.entitles.CommonResult;
import com.zx.springcloud.entitles.Payment;
import com.zx.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @RequestMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);

        if (result>0){  //成功
            return new CommonResult(200,"插入数据库失败",result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getpaymentById(id);
        if (payment!=null){  //说明有数据，能查询成功
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询ID："+id,null);
        }
    }


}
