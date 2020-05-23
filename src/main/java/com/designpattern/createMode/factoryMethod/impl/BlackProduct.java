package com.designpattern.createMode.factoryMethod.impl;

import com.designpattern.createMode.factoryMethod.Product;

public class BlackProduct implements Product {
    @Override
    public void show() {

        System.out.println("我是黑色产品");
    }
}
