package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/25
 */
public interface Node {
    /**
     * 节点接受访问者
     * @param visitor
     */
    void accept(Visitor visitor);
}
