package com.southwind.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggerAspect {

    @Before(value = "execution(public int com.southwind.utils.impl.CalImpl.*(..))")
    public void before(JoinPoint joinPoint){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        //获取参数
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name+"方法的参数是："+ args);
    }

    @After(value = "execution(public int com.southwind.utils.impl.CalImpl.*(..))")
    public void after(JoinPoint joinPoint){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法执行完毕");
    }

    @AfterReturning(value = "execution(public int com.southwind.utils.impl.CalImpl.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法的结果是"+result);
    }

    @AfterThrowing(value = "execution(public int com.southwind.utils.impl.CalImpl.*(..))",throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint,Exception exception){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法抛出异常："+exception);
    }


}