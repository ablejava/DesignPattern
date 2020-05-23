package com.designpattern.createType.singletonpattern.simpleFactory;

public interface Creator {

    <T extends Product> T createProduct(Class<T> c);
}
