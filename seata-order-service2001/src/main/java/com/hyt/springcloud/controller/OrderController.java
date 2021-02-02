package com.hyt.springcloud.controller;

import com.hyt.springcloud.domain.CommonResult;
import com.hyt.springcloud.domain.Order;
import com.hyt.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author huyouting
 * @Date 2021/1/29 15:38
 * @Description:
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

}
