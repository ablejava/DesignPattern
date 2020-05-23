package com.designpattern.structuralType.decorator;

import com.designpattern.structuralType.decorator.impl.ConcreteComponent;
import com.designpattern.structuralType.decorator.impl.ConcreteDecorator;

public class main {

    /**
     * 装饰模式
     * 在不改变原有类基础上给类增加新的功能
     * @param args
     */
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();

        Component decoratorComponent = new ConcreteDecorator(component);
        decoratorComponent.operation();
    }
}
