package com.timo;

/**
 * 工厂方法的测试类
 * @author Abraham Qin
 * @since 2018/11/24
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ClothFactory();
        Product product = factory.crateProduct();
        product.concreteFunction();
    }
}
