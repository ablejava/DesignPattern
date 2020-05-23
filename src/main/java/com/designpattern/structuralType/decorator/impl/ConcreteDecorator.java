package com.designpattern.structuralType.decorator.impl;

import com.designpattern.structuralType.decorator.Component;
import com.designpattern.structuralType.decorator.Decorator;

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
