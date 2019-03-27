package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/27
 */
public class ConcreteAdaptee implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("specific request");
    }
}
