package com.designpattern.behavioralModel.visitor;

import com.designpattern.behavioralModel.visitor.impl.ConcreteElementA;
import com.designpattern.behavioralModel.visitor.impl.ConcreteElementB;
import com.designpattern.behavioralModel.visitor.impl.ConcreteVisitorA;
import com.designpattern.behavioralModel.visitor.impl.ConcreteVisitorB;

public class main {

    /**
     * 访问者模式
     * @param args
     */
    public static void main(String[] args) {
        ObjectStructure os=new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor=new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor=new ConcreteVisitorB();
        os.accept(visitor);
    }
}
