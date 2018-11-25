package com.timo;

/**
 * @author Abraham Qin
 * @since 2018/11/25
 */
public class ConcreteDecorator3 extends Decorator {
    public ConcreteDecorator3(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("会吃虫子的");
        super.operation();
    }
}
