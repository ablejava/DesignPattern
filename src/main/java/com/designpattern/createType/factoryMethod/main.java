package com.designpattern.createType.factoryMethod;

import com.designpattern.createType.factoryMethod.impl.BlackFactory;
import com.designpattern.createType.factoryMethod.impl.RedFactory;

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
