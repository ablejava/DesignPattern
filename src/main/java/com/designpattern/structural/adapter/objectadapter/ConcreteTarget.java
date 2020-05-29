package com.designpattern.structural.adapter.objectadapter;


/**
 *
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
