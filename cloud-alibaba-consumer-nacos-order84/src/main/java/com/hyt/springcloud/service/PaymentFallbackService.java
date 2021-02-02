package com.hyt.springcloud.service;

import com.hyt.springcloud.entities.CommonResult;
import com.hyt.springcloud.entities.Payment;

/**
 * @Author huyouting
 * @Date 2021/1/28 17:25
 * @Description:
 */
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
