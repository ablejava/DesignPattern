package com.designpattern.behavioralModel.visitor.impl;

import com.designpattern.behavioralModel.visitor.Element;
import com.designpattern.behavioralModel.visitor.Visitor;

/**
 * 具体元素B
 */
public class ConcreteElementB implements Element {

    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
    public String operationB()
    {
        return "具体元素B的操作。";
    }
}
