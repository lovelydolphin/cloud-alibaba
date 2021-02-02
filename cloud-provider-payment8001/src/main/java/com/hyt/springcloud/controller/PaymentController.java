package com.hyt.springcloud.controller;

import com.hyt.springcloud.entities.CommonResult;
import com.hyt.springcloud.entities.Payment;
import com.hyt.springcloud.sevice.PaymentService;
import com.sun.org.apache.regexp.internal.RE;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author huyouting
 * @Date 2021/1/21 14:11
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("******插入结果:" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort: "+serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询结果成功,serverPort: "+serverPort, payment);
        } else {
            return new CommonResult(444, "查询结果失败，查询id：" + id, null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public DiscoveryClient discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("******element: "+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances(services.get(0));
        log.info("******instances: "+instances);
        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
