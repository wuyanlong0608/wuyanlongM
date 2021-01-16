package com.zx.springcloud.service.impl;

import com.zx.springcloud.dao.PaymentDao;
import com.zx.springcloud.entitles.Payment;
import com.zx.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getpaymentById(long id) {
        return paymentDao.getpaymentById(id);
    }
}
