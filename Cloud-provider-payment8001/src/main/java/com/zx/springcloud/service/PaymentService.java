package com.zx.springcloud.service;

import com.zx.springcloud.entitles.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);//新增
    public Payment getpaymentById(@Param("id")long id); //查询
}
