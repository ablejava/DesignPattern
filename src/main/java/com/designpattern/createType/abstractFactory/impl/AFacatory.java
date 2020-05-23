package com.designpattern.createType.abstractFactory.impl;

import com.designpattern.createType.abstractFactory.AbstractFactory;
import com.designpattern.createType.abstractFactory.BlackProduct;
import com.designpattern.createType.abstractFactory.RedProduct;

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
