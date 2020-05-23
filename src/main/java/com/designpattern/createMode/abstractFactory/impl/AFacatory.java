package com.designpattern.createMode.abstractFactory.impl;

import com.designpattern.createMode.abstractFactory.AbstractFactory;
import com.designpattern.createMode.abstractFactory.BlackProduct;
import com.designpattern.createMode.abstractFactory.RedProduct;

public class AFacatory implements AbstractFactory {
    @Override
    public RedProduct createRedProduct() {
        return new ARedProduct();
    }

    @Override
    public BlackProduct createBlackProduct() {
        return new ABlackProduct();
    }
}
