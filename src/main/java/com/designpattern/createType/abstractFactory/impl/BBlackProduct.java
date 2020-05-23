package com.designpattern.createType.abstractFactory.impl;

import com.designpattern.createType.abstractFactory.BlackProduct;

public class BBlackProduct implements BlackProduct {
    @Override
    public void show() {

        System.out.println("b factory 生产的 black Product");
    }
}
