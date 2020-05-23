package com.designpattern.createMode.singletonpattern.simpleFactory;

public interface Creator {

    <T extends Product> T createProduct(Class<T> c);
}
