package com.designpattern.createType.factoryMethod.impl;

import com.designpattern.createType.factoryMethod.Product;

public class RedProduct implements Product {
    @Override
    public void show() {
        System.out.println("我是红色产品");
    }
}
