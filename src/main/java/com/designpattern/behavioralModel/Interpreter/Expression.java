package com.designpattern.behavioralModel.Interpreter;

/**
 * 抽象表达式
 */
public interface Expression {

    boolean interpret(String info);   //解释方法
}
