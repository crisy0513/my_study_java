package com.example.demo_log;

import java.lang.annotation.*;

/**
 * @author wangchenxin
 * @date 2020/6/29  16:00
 * @desc
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLogger {
    String value() default "";
}
