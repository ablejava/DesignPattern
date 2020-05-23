package com.designpattern.createType.singletonpattern.lazySingleton;

/**
 * 线程安全的方式
 */
public class Singleton {
    private static final  Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getSingleton() {
        return singleton;
    }

    public static void  doSomething(){

    }
}
