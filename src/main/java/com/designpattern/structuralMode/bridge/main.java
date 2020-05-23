package com.designpattern.structuralMode.bridge;

import com.designpattern.structuralMode.bridge.impl.ConcreteImplementorA;
import com.designpattern.structuralMode.bridge.impl.RefinedAbstraction;

public class main {

    /**
     * 桥接模式
     * 抽象与实现相分离
     * 对一个接口对调用转换为对另一个接口对调用
     * @param args
     */
    public static void main(String[] args) {
        Implementor imple = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imple);
        abs.Operation();
    }
}
