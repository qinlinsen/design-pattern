package com.qls;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        List<Observer> observers = new ArrayList<>();
        concreteSubject.setObservers(observers);
        ConcreteObserverA concreteObserverA = new ConcreteObserverA();
        concreteSubject.add(concreteObserverA);
        concreteSubject.add(new ConcreteObserverB());
        concreteSubject.notifyObserver();
    }
}
