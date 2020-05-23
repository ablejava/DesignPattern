package com.designpattern.behavioralModel.chainOfResponsibility;

import com.designpattern.behavioralModel.chainOfResponsibility.impl.ConcreteHandler1;
import com.designpattern.behavioralModel.chainOfResponsibility.impl.ConcreteHandler2;

public class main {

    /**
     * 责任链模式
     * @param args
     */
    public static void main(String[] args) {
        //组装责任链
        Handler handler1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}
