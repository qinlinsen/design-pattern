package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public class Client {
    public static void main(String[] args) {
        ConcreteHanlderA concreteHanlderA = new ConcreteHanlderA();
        ConcreteHanlderB concreteHanlderB = new ConcreteHanlderB();
        concreteHanlderA.setNext(concreteHanlderB);
        concreteHanlderA.handleRequest("two");
    }
}
