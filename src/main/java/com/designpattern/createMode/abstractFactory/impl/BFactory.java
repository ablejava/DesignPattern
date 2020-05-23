package com.designpattern.createMode.abstractFactory.impl;

import com.designpattern.createMode.abstractFactory.AbstractFactory;
import com.designpattern.createMode.abstractFactory.BlackProduct;
import com.designpattern.createMode.abstractFactory.RedProduct;

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
