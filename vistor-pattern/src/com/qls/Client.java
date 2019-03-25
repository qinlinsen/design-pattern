package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/25
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.add(new ConcreteNodeA());
        structure.action(new ConcreteVisitorA());

    }
}
