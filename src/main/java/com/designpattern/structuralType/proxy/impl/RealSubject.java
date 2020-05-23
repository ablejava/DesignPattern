package com.designpattern.structuralType.proxy.impl;

import com.designpattern.structuralType.proxy.Subject;

public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
