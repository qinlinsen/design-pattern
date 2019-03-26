package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass method = new DerivedAbstractMethodB();
        method.templateMethod();
    }
}
