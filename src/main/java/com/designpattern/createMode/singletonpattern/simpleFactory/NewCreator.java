package com.designpattern.createMode.singletonpattern.simpleFactory;

public class NewCreator implements Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {

        return (T) new Product();
    }
}
