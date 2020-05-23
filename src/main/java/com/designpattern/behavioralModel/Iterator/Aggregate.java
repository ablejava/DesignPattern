package com.designpattern.behavioralModel.Iterator;

/**
 * 抽象聚合
 */
public interface Aggregate {

    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}
