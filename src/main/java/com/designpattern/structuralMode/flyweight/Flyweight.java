package com.designpattern.structuralMode.flyweight;

/**
 * 抽象享元角色
 */
public interface Flyweight {
    void operation(UnsharedConcreteFlyweight state);
}
