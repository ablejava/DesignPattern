package com.designpattern.structuralMode.adapter;

public class ClassAdapterMain {

    /**
     * 类适配器模式
     * @param args
     */
    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();
    }
}
