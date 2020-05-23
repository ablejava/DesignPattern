package com.designpattern.structuralType.composite;

/**
 * 抽象构建
 */
public interface Component {

    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    void operation();
}
