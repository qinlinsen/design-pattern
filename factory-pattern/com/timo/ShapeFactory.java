package com.timo;

/**
 * 创建Shape的工厂类
 * @author qinlinsen
 */
public class ShapeFactory {
    /**
     * 得到形状的一个工厂方法：
     * @param shapeName  the name of shape like circle ,rectangle, triangle ...
     * @return Shape
     */
    public Shape getShape(String shapeName){
        if(shapeName==null){
            return  null;
        }
        if("circle".equalsIgnoreCase(shapeName)){
            return new Circle();
        }
        if("rectangle".equalsIgnoreCase(shapeName)){
            return new Rectangle();
        }
        if("square".equalsIgnoreCase(shapeName)){
            return new Square();
        }
        return null;
    }
}
