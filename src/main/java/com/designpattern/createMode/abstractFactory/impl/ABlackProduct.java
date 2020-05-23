package com.designpattern.createMode.abstractFactory.impl;

import com.designpattern.createMode.abstractFactory.BlackProduct;

public class ABlackProduct implements BlackProduct {
    @Override
    public void show() {

        System.out.println("A factory 生产的 Black product");
    }
}
