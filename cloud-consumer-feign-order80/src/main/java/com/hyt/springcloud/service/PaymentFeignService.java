package com.hyt.springcloud.service;

import com.hyt.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author huyouting
 * @Date 2021/1/22 15:06
 * @Description:
 */
@FeignClient(value = "COULD-PAYMENT-SERVICE")//Eureka服务名称
@Component
public interface PaymentFeignService {

    @GetMapping(value = "/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);
}
