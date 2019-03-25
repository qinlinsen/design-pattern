package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/25
 */
public class ConcreteNodeA implements Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
