package com.designpattern.structuralType.adapter;

public class ObjectAdapterMain {

    /**
     * 对象适配器模式
     * @param args
     */
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
