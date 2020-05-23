package com.designpattern.behavioralModel.state;

public class main {

    /**
     * 状态模式
     * @param args
     */
    public static void main(String[] args) {
        Context context=new Context();    //创建环境
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
