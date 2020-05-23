package com.designpattern.createMode.builder;

/**
 * 抽象建造者
 */
public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buidPartC();

    public Product getResult() {
        return product;
    }
}
