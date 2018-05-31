package com.timo;

/**
 * 创建Shape的工厂类
 * @author qinlinsen
 */
public class ShapeFactory {
    private static final String CIRCLE = "circle";
    private static final String RECTANGLE = "rectangle";
    private static final String SQUARE = "square";
    /**
     * 得到形状的一个工厂方法：
     * @param shapeName  the name of shape like circle ,rectangle, triangle ...
     * @return Shape
     */
    public Shape getShape(String shapeName){
        if(shapeName==null){
            return  null;
        }
        if(CIRCLE.equalsIgnoreCase(shapeName)){
            return new Circle();
        }
        if(RECTANGLE.equalsIgnoreCase(shapeName)){
            return new Rectangle();
        }
        if(SQUARE.equalsIgnoreCase(shapeName)){
            return new Square();
        }
        return null;
    }
}
