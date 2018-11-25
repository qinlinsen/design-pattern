package com.timo;

/**
 * @author Abraham Qin
 * @since 2018/11/24
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("鸟");
    }
}
