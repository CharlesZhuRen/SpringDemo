package com.neusoft.spring.beans;

import org.springframework.stereotype.Component;

//@Component
public class Huawei implements CellPhone{
    public void call(){
        System.out.println("this is huawei calling");
    }
}
