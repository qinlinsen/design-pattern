package com.timo;

/**
 * @author Abraham Qin
 * @since 2018/11/25
 */
public interface Builder {
    /**
     * 建造车身
     */
    void buildCarBody();

    /**
     * 建造车的外观
     */
    void buildCarAppearance();

    /**
     * 创建车
     * @return Car
     */
    Car createCar();
}
