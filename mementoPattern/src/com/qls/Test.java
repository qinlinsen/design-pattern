package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/25
 */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("0");
        System.out.println(originator.getState());
        Caretaker caretaker = new Caretaker();
        Memento memento = originator.createMemento();
        caretaker.setMemento(memento);
        originator.setState("1");
        System.out.println(originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
