package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/27
 */
public class Client {
    public static void main(String[] args) {
        Adaptor adaptor = new Adaptor();
        ConcreteAdaptee concreteAdaptee = new ConcreteAdaptee();
        adaptor.setAdaptee(concreteAdaptee);
        adaptor.request();
    }
}
