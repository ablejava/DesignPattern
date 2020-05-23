package com.designpattern.behavioralModel.command;

import com.designpattern.behavioralModel.command.impl.ConcreteCommand;

public class main {

    /**
     * 命令模式
     * @param args
     */
    public static void main(String[] args) {
        // 创建命令
        Command cmd=new ConcreteCommand();

        // 创建调用者
        Invoker ir=new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}
