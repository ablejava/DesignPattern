package com.designpattern.createType.prototype;

public class RealizeType implements Cloneable {
    RealizeType(){
        System.out.println("创建RealizeType");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (RealizeType)super.clone();
    }
}
