package com.designpattern.behavioralModel.visitor.impl;

import com.designpattern.behavioralModel.visitor.Element;
import com.designpattern.behavioralModel.visitor.Visitor;

/**
 * 具体元素A
 */
public class ConcreteElementA implements Element {

    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
    public String operationA()
    {
        return "具体元素A的操作。";
    }
}
