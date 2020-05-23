package com.designpattern.createType.abstractFactory.impl;

import com.designpattern.createType.abstractFactory.RedProduct;

public class ARedProduct implements RedProduct {
    @Override
    public void show() {
        System.out.println("a factory 生产的 RedProduct");

    }
}
