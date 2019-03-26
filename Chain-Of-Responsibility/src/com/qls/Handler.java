package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String str);
}
