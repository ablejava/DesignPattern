package com.designpattern.structuralType.proxy;

import com.designpattern.structuralType.proxy.impl.RealSubject;

public class Proxy implements Subject {
    private RealSubject realSubject;
    @Override
    public void Request() {

        if (realSubject==null)
        {
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("访问之前的处理。。。");
    }

    public void postRequest() {
        System.out.println("访问之后的处理。。。");
    }
}
