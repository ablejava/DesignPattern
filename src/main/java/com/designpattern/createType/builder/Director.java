package com.designpattern.createType.builder;

/**
 * 指挥者
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buidPartC();
        return builder.getResult();
    }
}
