package com.designpattern.structuralType.bridge;

/**
 * 抽象化角色
 */
public abstract class Abstraction {

    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    protected abstract void Operation();
}
