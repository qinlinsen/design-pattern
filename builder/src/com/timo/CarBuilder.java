package com.timo;

/**
 * @author Abraham Qin
 * @since 2018/11/25
 */
public class CarBuilder implements Builder {
    Car car;
    public CarBuilder() {
        car=new Car();
    }

    @Override
    public void buildCarBody() {
        car.setBody("车身");
    }

    @Override
    public void buildCarAppearance() {
        car.setAppearance("车外观");
    }

    @Override
    public Car createCar() {
        return car;
    }
}
