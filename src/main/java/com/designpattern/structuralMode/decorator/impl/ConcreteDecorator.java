package com.designpattern.structuralMode.decorator.impl;

import com.designpattern.structuralMode.decorator.Component;
import com.designpattern.structuralMode.decorator.Decorator;

/**
 * 具体装饰
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction(){
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
