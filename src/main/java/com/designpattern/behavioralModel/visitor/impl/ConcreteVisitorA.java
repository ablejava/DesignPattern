package com.designpattern.behavioralModel.visitor.impl;

import com.designpattern.behavioralModel.visitor.Visitor;

/**
 * 具体访问者
 */
public class ConcreteVisitorA implements Visitor {

    public void visit(ConcreteElementA element)
    {
        System.out.println("具体访问者A访问-->"+element.operationA());
    }
    public void visit(ConcreteElementB element)
    {
        System.out.println("具体访问者A访问-->"+element.operationB());
    }
}
