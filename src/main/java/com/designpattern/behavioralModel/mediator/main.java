package com.designpattern.behavioralModel.mediator;

import com.designpattern.behavioralModel.mediator.impl.ConcreteColleague1;
import com.designpattern.behavioralModel.mediator.impl.ConcreteColleague2;
import com.designpattern.behavioralModel.mediator.impl.ConcreteMediator;

public class main {

    /**
     * 中介者模式
     * @param args
     */
    public static void main(String[] args) {
        Mediator md=new ConcreteMediator();
        Colleague c1,c2;
        c1=new ConcreteColleague1();
        c2=new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
