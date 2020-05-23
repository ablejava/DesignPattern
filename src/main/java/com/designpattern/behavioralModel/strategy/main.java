package com.designpattern.behavioralModel.strategy;

import com.designpattern.behavioralModel.strategy.impl.ConcreteStrategyA;
import com.designpattern.behavioralModel.strategy.impl.ConcreteStrategyB;

public class main {

    /**
     * 策略模式
     * @param args
     */
    public static void main(String[] args) {
        Context c=new Context();
        Strategy s=new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();

        System.out.println("-----------------");
        s=new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
