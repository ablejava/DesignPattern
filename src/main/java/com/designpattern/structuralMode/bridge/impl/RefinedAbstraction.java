package com.designpattern.structuralMode.bridge.impl;

import com.designpattern.structuralMode.bridge.Abstraction;
import com.designpattern.structuralMode.bridge.Implementor;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    protected void Operation() {

        System.out.println("扩展抽象化(Refined Abstraction)角色被访问" );
        implementor.OperationImpl();
    }
}
