package com.designpattern.behavioralModel.strategy.impl;

import com.designpattern.behavioralModel.strategy.Strategy;

/**
 * 具体策略A
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");

    }
}
