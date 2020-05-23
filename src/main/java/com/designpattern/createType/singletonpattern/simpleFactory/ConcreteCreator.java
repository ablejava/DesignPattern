package com.designpattern.createType.singletonpattern.simpleFactory;

public class ConcreteCreator implements Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();

        } catch (Exception e) {
            // 异常
        }
        return (T) product;
    }
}
