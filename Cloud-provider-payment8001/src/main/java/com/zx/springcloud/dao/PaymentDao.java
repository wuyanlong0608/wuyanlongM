package com.zx.springcloud.dao;

import com.zx.springcloud.entitles.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public int create(Payment payment);//新增

    public Payment getpaymentById(@Param("id")long id); //查询
}
