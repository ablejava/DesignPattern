package com.designpattern.behavioralModel.observer;

import com.designpattern.behavioralModel.observer.impl.ConcreteObserver1;
import com.designpattern.behavioralModel.observer.impl.ConcreteObserver2;
import com.designpattern.behavioralModel.observer.impl.ConcreteSubject;
import com.designpattern.behavioralModel.observer.impl.Observer;

public class main {

    /**
     * 观察者模式
     * @param args
     */
    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();
        Observer obs1=new ConcreteObserver1();
        Observer obs2=new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }
}
