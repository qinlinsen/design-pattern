package com.programmer;

/**
 * @author Abraham Qin
 * @since 2019/3/25
 */
public interface Element {
    void accept(Visitor visitor);
}
