package com.programmer;

/**
 * @author Abraham Qin
 * @since 2019/3/25
 */
public class ConcreteElement implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        System.out.println("hello world");
    }
}
