package com.designpattern.createType.abstractFactory.impl;

import com.designpattern.createType.abstractFactory.RedProduct;

public class BRedProduct implements RedProduct {
    @Override
    public void show() {

        System.out.println("B factory 生产的 Red product");
    }
}
