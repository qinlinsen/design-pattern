package com.timo;

/**
 * @author Abraham Qin
 * @since 2018/11/24
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("会飞的");
        super.operation();
    }
}
