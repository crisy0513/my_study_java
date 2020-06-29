package com.example.demo_log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author wangchenxin
 * @date 2020/6/29  16:02
 * @desc
 */
@Aspect
@Component
public class SysLogAspect {
    //切点
    @Pointcut("@annotation(com.example.demo_log.SysLogger)")
    public void loggerPointCut(){}

    @Autowired
    AmqpTemplate amqpTemplate;

    @Value("${queuename}")
    String queuename;

    @Before("loggerPointCut()")
    public void saveSysLog(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("aspect:"+method.getAnnotation(SysLogger.class).value());
        amqpTemplate.convertAndSend(queuename,method.getAnnotation(SysLogger.class).value());
    }
}
