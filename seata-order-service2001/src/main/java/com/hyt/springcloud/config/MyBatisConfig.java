package com.hyt.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author huyouting
 * @Date 2021/1/29 15:26
 * @Description:
 */
@Configuration
@MapperScan({"com.hyt.springcloud.dao"})
public class MyBatisConfig {
}
