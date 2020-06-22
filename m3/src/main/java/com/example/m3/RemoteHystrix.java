package com.example.m3;

import org.springframework.stereotype.Component;

/**
 * @author wangchenxin
 * @date 2020/6/22  13:23
 * @desc
 */
@Component
public class RemoteHystrix implements Remote{
    @Override
    public String hello(String name) {
        return "fail hello";
    }
}
