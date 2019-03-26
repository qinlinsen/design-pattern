package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public class ConcreteObserverB implements Observer {
    @Override
    public void response() {
        System.out.println("B Observer ");
    }
}
