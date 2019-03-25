package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/25
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visitor(Node node) {
        System.out.println("node a");
    }
}
