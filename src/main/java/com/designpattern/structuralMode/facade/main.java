package com.designpattern.structuralMode.facade;

public class main {

    /**
     * 外观模式
     * 对外提供统一接口，封装内部接口调用
     * @param args
     */
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
