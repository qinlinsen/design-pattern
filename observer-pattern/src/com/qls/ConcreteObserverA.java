package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public class ConcreteObserverA implements Observer {
    @Override
    public void response() {
        System.out.println("A Observer ");
    }
}
