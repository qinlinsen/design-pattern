package com.timo;

/**
 * @author Abraham Qin
 * @since 2018/11/24
 */
public class Decorator implements Component {
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
