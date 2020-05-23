package com.designpattern.behavioralModel.mediator;

/**
 * 具体同事类
 */
public abstract class Colleague {

    protected Mediator mediator;
    public void setMedium(Mediator mediator)
    {
        this.mediator=mediator;
    }
    public abstract void receive();
    public abstract void send();
}
