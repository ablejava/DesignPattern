package com.designpattern.createType.abstractFactory.impl;

import com.designpattern.createType.abstractFactory.AbstractFactory;
import com.designpattern.createType.abstractFactory.BlackProduct;
import com.designpattern.createType.abstractFactory.RedProduct;

public class BFactory implements AbstractFactory {
    @Override
    public RedProduct createRedProduct() {
        return new BRedProduct();
    }

    @Override
    public BlackProduct createBlackProduct() {
        return new BBlackProduct();
    }
}
