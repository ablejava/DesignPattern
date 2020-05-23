package com.designpattern.createMode.singletonpattern.simpleFactory;

public class SimpleFactory {

    public static Product createProduct(String byType) {
        Creator product = null;
        switch (byType){
            case "1" : product = new ConcreteCreator(); break;
            case "2" : product = new NewCreator(); break;
        }
        return product.createProduct(Product.class);
    }
}
