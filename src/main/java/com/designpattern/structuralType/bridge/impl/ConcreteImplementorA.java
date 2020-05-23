package com.designpattern.structuralType.bridge.impl;

import com.designpattern.structuralType.bridge.Implementor;

/**
 * 具体实现化角色
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void OperationImpl() {

        System.out.println("具体实现化(Concrete Implementor)角色被访问" );
    }
}
