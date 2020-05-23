package com.designpattern.behavioralModel.state.impl;

import com.designpattern.behavioralModel.state.Context;
import com.designpattern.behavioralModel.state.State;

/**
 * 具体状态类B
 */
public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {

        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
