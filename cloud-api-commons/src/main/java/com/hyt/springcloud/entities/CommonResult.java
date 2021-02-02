package com.hyt.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author huyouting
 * @Date 2021/1/21 13:43
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult <T>{

    private Integer code;
    private String message;
    private T      data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
