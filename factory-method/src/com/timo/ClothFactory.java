package com.timo;

/**具体的共厂类，这里是ClothFactory衣服工厂
 * @author Abraham Qin
 * @since 2018/11/24
 */
public class ClothFactory implements Factory {
    @Override
    public Product crateProduct() {
        return new ClothProduct();
    }
}
