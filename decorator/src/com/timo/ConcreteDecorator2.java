package com.timo;

/**
 * @author Abraham Qin
 * @since 2018/11/25
 */
public class ConcreteDecorator2 extends Decorator{

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("漂亮的");
        super.operation();
    }
}
