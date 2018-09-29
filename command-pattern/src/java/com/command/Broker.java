package com.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abraham Qin
 * @since 2018/9/29
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
