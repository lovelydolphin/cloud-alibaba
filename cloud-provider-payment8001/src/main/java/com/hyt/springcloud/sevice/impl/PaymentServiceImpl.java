package com.hyt.springcloud.sevice.impl;

import com.hyt.springcloud.dao.PaymentDao;
import com.hyt.springcloud.entities.Payment;
import com.hyt.springcloud.sevice.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author huyouting
 * @Date 2021/1/21 14:05
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
