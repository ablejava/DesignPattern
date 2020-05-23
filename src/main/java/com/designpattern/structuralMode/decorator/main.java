package com.designpattern.structuralMode.decorator;

import com.designpattern.structuralMode.decorator.impl.ConcreteComponent;
import com.designpattern.structuralMode.decorator.impl.ConcreteDecorator;

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
