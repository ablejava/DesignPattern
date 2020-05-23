package com.designpattern.behavioralModel.state.impl;

import com.designpattern.behavioralModel.state.Context;
import com.designpattern.behavioralModel.state.State;

/**
 * 具体状态类A
 */
public class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {

        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
