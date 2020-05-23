package com.designpattern.createMode.prototype;

public class main {
    /**
     * 原型模式的应用
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        RealizeType realizeTypeClone  = (RealizeType) realizeType.clone();

        System.out.println(realizeType == realizeTypeClone ? true : false);
    }
}
