package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/27
 */
public class Adaptor implements Target {
    private Adaptee adaptee;

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("request");
    }
}
