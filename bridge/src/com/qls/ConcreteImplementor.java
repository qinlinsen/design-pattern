package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public class ConcreteImplementor implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("a");
    }
}
