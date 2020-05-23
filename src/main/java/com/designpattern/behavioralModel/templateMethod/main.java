package com.designpattern.behavioralModel.templateMethod;

import com.designpattern.behavioralModel.templateMethod.impl.ConcreteClass;

public class main {

    /**
     * 模版方法
     * @param args
     */
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.TemplateMethod();
    }
}
