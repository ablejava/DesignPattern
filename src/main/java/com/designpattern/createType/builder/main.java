package com.designpattern.createType.builder;

public class main {
    public static void main(String[] args) {
        // 创建构建者
        Builder builder=new ConcreteBuilder();
        // 创建指挥官
        Director director=new Director(builder);
        // 创建product
        Product product=director.construct();
        product.show();
    }
}
