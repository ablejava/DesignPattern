package com.designpattern.behavioralModel.command.impl;

import com.designpattern.behavioralModel.command.Command;
import com.designpattern.behavioralModel.command.Receiver;

/**
 * 具体命令
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;
    public ConcreteCommand(){
        receiver=new Receiver();
    }

    public void execute() {
        receiver.action();
    }
}
