package com.timo;

/**
 * @author Abraham Qin
 * @since 2018/11/24
 */
public class Client {
    public static void main(String[] args) {
       new ConcreteDecorator3( new ConcreteDecorator2(new ConcreteDecorator(new ConcreteComponent()))).operation();
    }
}
