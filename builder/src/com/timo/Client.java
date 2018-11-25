package com.timo;

/**
 * @author Abraham Qin
 * @since 2018/11/25
 */
public class Client {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        Car car = new Director(carBuilder).create();
        System.out.println(car);
    }
}
