package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/25
 */
public interface Visitor {
    /**
     * 访问节点的方法
     * @param node  节点
     */
    void visitor(Node node);
}
