package com.designpattern.createMode.factoryMethod;

import com.designpattern.createMode.factoryMethod.impl.BlackFactory;
import com.designpattern.createMode.factoryMethod.impl.RedFactory;

public class main {

    /**
     * 简单工厂方法模型
     * @param args
     */
    public static void main(String[] args) {
        RedFactory redFactory = new RedFactory();
        Product product = redFactory.newProduct();
        product.show();

        BlackFactory blackFactory = new BlackFactory();
        Product product1 = blackFactory.newProduct();
        product1.show();
    }
}
