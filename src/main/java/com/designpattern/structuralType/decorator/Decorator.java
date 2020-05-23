package com.designpattern.structuralType.decorator;

/**
 * 抽象装饰
 */
public class Decorator implements Component {

    private Component component;


    public Decorator(Component component){
        this.component=component;
    }

    @Override
    public void operation()
    {
        component.operation();
    }
}
