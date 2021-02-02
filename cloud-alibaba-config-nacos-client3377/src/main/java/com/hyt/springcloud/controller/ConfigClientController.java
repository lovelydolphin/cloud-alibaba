package com.hyt.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huyouting
 * @Date 2021/1/23 15:47
 * @Description:
 */
@RestController
@RefreshScope //支持Nacos的动态刷新功能。
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @Value("${car.type}")
    private String carType;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo+"==============="+carType;
    }

}
