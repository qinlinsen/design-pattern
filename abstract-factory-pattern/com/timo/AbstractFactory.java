package com.timo;

/**抽象工厂说白了就是创建工厂的工厂，只是在工厂设计模式的上面加了一层，用于创建工厂
 * @author qinlinsen
 */
public interface AbstractFactory {
    /**
     * 定义一个返回返回衣服方法
     * @param clothType
     * @return
     */
    Cloth getCloth(String clothType);

    /**
     * 定义一个返回鞋的方法
     * @param shoeType
     * @return
     */
    Shoe getShoe(String shoeType);
}
