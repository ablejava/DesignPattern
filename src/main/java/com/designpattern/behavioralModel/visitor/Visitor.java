package com.designpattern.behavioralModel.visitor;

import com.designpattern.behavioralModel.visitor.impl.ConcreteElementA;
import com.designpattern.behavioralModel.visitor.impl.ConcreteElementB;

/**
 * 抽象访问者
 */
public interface Visitor {

    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
