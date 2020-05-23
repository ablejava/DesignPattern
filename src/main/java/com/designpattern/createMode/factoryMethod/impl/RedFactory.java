package com.designpattern.createMode.factoryMethod.impl;

import com.designpattern.createMode.factoryMethod.AbstractFactory;
import com.designpattern.createMode.factoryMethod.Product;

public class RedFactory implements AbstractFactory {
    @Override
    public Product newProduct() {
        return new RedProduct();
    }
}
