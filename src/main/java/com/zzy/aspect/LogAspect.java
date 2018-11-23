package com.zzy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LogAspect {
    @Pointcut(value = "execution(* com.zzy.service.*.*(..))")
    public void pp(){ }

    @Around(value = "pp()")
    public Object testAround(ProceedingJoinPoint proceedingJoinPoint){
        Object proceed = null;
        try {
            System.out.println("before");
            proceed = proceedingJoinPoint.proceed();
            System.out.println("after");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return proceed;
    }
}
