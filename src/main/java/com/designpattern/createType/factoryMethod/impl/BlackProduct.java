package com.designpattern.createType.factoryMethod.impl;

import com.designpattern.createType.factoryMethod.Product;

public class BlackProduct implements Product {
    @Override
    public void show() {

        System.out.println("我是黑色产品");
    }
}
