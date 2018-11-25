package com.timo;

/**
 * 具体的产品，这里是ClothProduct衣服
 * @author Abraham Qin
 * @since 2018/11/24
 */
public class ClothProduct implements Product {
    @Override
    public void concreteFunction() {
        System.out.println("生产衣服");
    }
}
