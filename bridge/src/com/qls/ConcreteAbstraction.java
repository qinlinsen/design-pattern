package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public class ConcreteAbstraction extends Abstarction {
    public ConcreteAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void opeartion() {
        System.out.println("abstraction");

    }
}
