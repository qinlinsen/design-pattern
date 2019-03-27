package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/27
 */
public interface Mediator {
    void register(AbstractColleage colleage);
    void relay(AbstractColleage colleage);
}
