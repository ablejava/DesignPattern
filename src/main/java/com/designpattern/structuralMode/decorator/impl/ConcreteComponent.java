package com.designpattern.structuralMode.decorator.impl;

import com.designpattern.structuralMode.decorator.Component;

/**
 * 具体构建
 */
public class ConcreteComponent implements Component {


    public ConcreteComponent() {
        System.out.println("创建具体构建角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");

    }
}
