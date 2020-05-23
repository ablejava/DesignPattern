package com.designpattern.structuralType.adapter;

public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        this.specificRequest();
    }
}
