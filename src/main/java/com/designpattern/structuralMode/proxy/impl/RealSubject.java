package com.designpattern.structuralMode.proxy.impl;

import com.designpattern.structuralMode.proxy.Subject;

public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
