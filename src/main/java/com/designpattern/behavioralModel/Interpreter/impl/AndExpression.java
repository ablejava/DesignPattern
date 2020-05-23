package com.designpattern.behavioralModel.Interpreter.impl;

import com.designpattern.behavioralModel.Interpreter.Expression;

/**
 * 非终结符表达式
 */
public class AndExpression implements Expression {

    private Expression city=null;
    private Expression person=null;
    public AndExpression(Expression city,Expression person)
    {
        this.city=city;
        this.person=person;
    }
    public boolean interpret(String info)
    {
        String s[]=info.split("的");
        return city.interpret(s[0])&&person.interpret(s[1]);
    }
}
