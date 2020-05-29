package com.designpattern.behavioral.chainofresponsibility;

/**
 *
 */
public abstract class Approver {
    /**
     * 责任链模式，批准者中包含一个自己类型的元素
     */
    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }
    public abstract void deploy(Course course);
}
