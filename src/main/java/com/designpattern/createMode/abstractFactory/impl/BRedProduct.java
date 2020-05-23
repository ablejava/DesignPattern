package com.designpattern.createMode.abstractFactory.impl;

import com.designpattern.createMode.abstractFactory.RedProduct;

public class BRedProduct implements RedProduct {
    @Override
    public void show() {

        System.out.println("B factory 生产的 Red product");
    }
}
