package com.designpattern.createMode.abstractFactory.impl;

import com.designpattern.createMode.abstractFactory.BlackProduct;

public class BBlackProduct implements BlackProduct {
    @Override
    public void show() {

        System.out.println("b factory 生产的 black Product");
    }
}
