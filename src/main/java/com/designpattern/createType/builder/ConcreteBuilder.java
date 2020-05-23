package com.designpattern.createType.builder;

/**
 * 具体对构建者
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {

        product.setPartA("构建 partA");
    }

    @Override
    public void buildPartB() {

        product.setPartB("构建 part B");
    }

    @Override
    public void buidPartC() {
        product.setPartC("构建 part C");
    }
}
