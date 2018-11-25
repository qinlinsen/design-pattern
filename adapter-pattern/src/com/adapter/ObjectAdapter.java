package com.adapter;

/**
 * @author Abraham Qin
 * @since 2018/11/21
 */
public class ObjectAdapter implements Target{
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {

    }
}
