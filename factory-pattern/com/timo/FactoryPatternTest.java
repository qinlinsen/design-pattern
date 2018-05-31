package com.timo;

/**
 * 工厂方法的测试类：
 * @author qinlinsen
 */
public class FactoryPatternTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //创建一个Rectangle对象：
        shapeFactory.getShape("rectangle").draw();
        //创建一个Circle对象：
        shapeFactory.getShape("circle").draw();
        //创建一个Square对象：
        shapeFactory.getShape("square").draw();
    }
}
