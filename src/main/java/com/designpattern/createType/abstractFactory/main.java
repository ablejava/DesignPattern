package com.designpattern.createType.abstractFactory;

import com.designpattern.createType.abstractFactory.impl.AFacatory;
import com.designpattern.createType.abstractFactory.impl.BFactory;

public class main {

    /**
     * 抽象工厂
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 工厂A 生产RedProduct , BlackProduct
         */
        AbstractFactory factoryA = new AFacatory();
        RedProduct redProduct = factoryA.createRedProduct();
        redProduct.show();
        BlackProduct blackProduct = factoryA.createBlackProduct();
        blackProduct.show();


        /**
         * 工厂B 生产RedProduct, BlackProduct
         */
        AbstractFactory factoryB = new BFactory();
        RedProduct redProductB = factoryB.createRedProduct();
        redProductB.show();
        BlackProduct blackProductB = factoryB.createBlackProduct();
        blackProductB.show();

    }
}
