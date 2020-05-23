package com.designpattern.createType.abstractFactory.impl;

import com.designpattern.createType.abstractFactory.BlackProduct;

public class ABlackProduct implements BlackProduct {
    @Override
    public void show() {

        System.out.println("A factory 生产的 Black product");
    }
}
