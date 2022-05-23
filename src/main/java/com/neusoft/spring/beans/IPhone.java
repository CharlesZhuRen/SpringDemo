package com.neusoft.spring.beans;

import org.springframework.stereotype.Component;

//@Component("iphone")
public class IPhone implements CellPhone{
    double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public void call(){
        System.out.println("this is iphone calling");
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "price=" + price +
                '}';
    }
}
