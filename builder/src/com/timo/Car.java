package com.timo;

/**
 * 这个类就是一个具体的产品，相当于Builder Pattern中的Product
 * @author Abraham Qin
 * @since 2018/11/25
 */
public class Car {
    /**
     * 车身
     */
    private String body;
    /**
     * 车的外观
     */
    private String appearance;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "body='" + body + '\'' +
                ", appearance='" + appearance + '\'' +
                '}';
    }
}
