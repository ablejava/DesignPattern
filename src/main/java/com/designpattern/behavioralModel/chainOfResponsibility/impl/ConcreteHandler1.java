package com.designpattern.behavioralModel.chainOfResponsibility.impl;

import com.designpattern.behavioralModel.chainOfResponsibility.Handler;

/**
 * 具体处理者1
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(String request)
    {
        if(request.equals("one"))
        {
            System.out.println("具体处理者1负责处理该请求！");
        }
        else
        {
            if(getNext()!=null)
            {
                getNext().handleRequest(request);
            }
            else
            {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
