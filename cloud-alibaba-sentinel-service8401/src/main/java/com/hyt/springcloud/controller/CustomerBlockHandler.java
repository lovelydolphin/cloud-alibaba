package com.hyt.springcloud.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hyt.springcloud.entities.CommonResult;

/**
 * @Author huyouting
 * @Date 2021/1/28 15:43
 * @Description:
 */
public class CustomerBlockHandler {

    //必须是静态方法
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
