package com.designpattern.behavioralModel.mediator;

/**
 * 抽象中介
 */
public abstract class Mediator {

    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl); //转发
}
