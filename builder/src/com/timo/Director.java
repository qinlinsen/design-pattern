package com.timo;

/**
 * @author Abraham Qin
 * @since 2018/11/25
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public Car create(){
        builder.buildCarAppearance();
        builder.buildCarBody();
      return   builder.createCar();
    }
}
