package com.designpattern.createType.factoryMethod.impl;

import com.designpattern.createType.factoryMethod.AbstractFactory;
import com.designpattern.createType.factoryMethod.Product;

public class RedFactory implements AbstractFactory {
    @Override
    public Product newProduct() {
        return new RedProduct();
    }
}
