package com.designpattern.structural.proxy.staticproxy;


import com.designpattern.structural.proxy.Order;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
