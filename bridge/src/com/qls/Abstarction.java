package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public abstract  class Abstarction {
    public Implementor implementor;

    public Abstarction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void opeartion();
}
