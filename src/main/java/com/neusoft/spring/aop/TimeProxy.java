package com.neusoft.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeProxy {

    @Before("execution(public void com.neusoft.spring.aop.IPhone.call())")
    public void BeforeMethod(){
        System.out.println("BeforeMethog");
    }

    @After("execution(public void com.neusoft.spring.aop.IPhone.call())")
    public void AfterMethod(){
        System.out.println("AfterMethod");
    }
}
