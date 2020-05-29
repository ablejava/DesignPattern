package com.designpattern.behavioral.mediator;

/**
 *
 */
public class Test {
    /**
     *
     * 中介者模式
     *
     * 定义一个封装一组对象，如何交互的对象
     * 通过使对象如何相互引用，来促进松耦合，并允许独立改变他们的对象
     *
     * @param args
     */
    public static void main(String[] args) {
        User geely = new User("Geely");
        User tom= new User("Tom");

        geely.sendMessage(" Hey! Tom! Let's learn Design Pattern");
        tom.sendMessage("OK! Geely");
    }


}
