package com.designpattern.behavioralModel.observer.impl;


import com.designpattern.behavioralModel.observer.Subject;

/**
 * 具体目标
 */
public class ConcreteSubject extends Subject {


    public void notifyObserver()
    {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for(Object obs:observers)
        {
            ((Observer)obs).response();
        }

    }
}
