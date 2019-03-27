package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/27
 */
public abstract  class AbstractColleage {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();
    public abstract void send();
}
