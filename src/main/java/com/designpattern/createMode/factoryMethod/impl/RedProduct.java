package com.designpattern.createMode.factoryMethod.impl;

import com.designpattern.createMode.factoryMethod.Product;

public class RedProduct implements Product {
    @Override
    public void show() {
        System.out.println("我是红色产品");
    }
}
