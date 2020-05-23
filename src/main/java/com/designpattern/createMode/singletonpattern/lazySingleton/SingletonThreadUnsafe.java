package com.designpattern.createMode.singletonpattern.lazySingleton;

/**
 * 线程不安全方式
 */
public class SingletonThreadUnsafe {

    private static volatile SingletonThreadUnsafe singletonThreadUnsafe = null;

    public SingletonThreadUnsafe() {
    }

    public static synchronized SingletonThreadUnsafe getSingleton() {
        if (singletonThreadUnsafe == null){
            singletonThreadUnsafe = new SingletonThreadUnsafe();
        }
        return singletonThreadUnsafe;
    }
}
