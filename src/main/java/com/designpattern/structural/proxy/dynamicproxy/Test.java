package com.designpattern.structural.proxy.dynamicproxy;


import com.designpattern.structural.proxy.IOrderService;
import com.designpattern.structural.proxy.Order;
import com.designpattern.structural.proxy.OrderServiceImpl;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
