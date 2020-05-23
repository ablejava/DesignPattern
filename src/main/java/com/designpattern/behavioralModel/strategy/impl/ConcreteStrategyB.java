package com.designpattern.behavioralModel.strategy.impl;

import com.designpattern.behavioralModel.strategy.Strategy;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
