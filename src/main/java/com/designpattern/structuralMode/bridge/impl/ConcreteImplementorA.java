package com.designpattern.structuralMode.bridge.impl;

import com.designpattern.structuralMode.bridge.Implementor;

/**
 * 具体实现化角色
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void OperationImpl() {

        System.out.println("具体实现化(Concrete Implementor)角色被访问" );
    }
}
