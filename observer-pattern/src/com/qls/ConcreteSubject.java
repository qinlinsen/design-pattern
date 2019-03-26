package com.qls;

import java.util.List;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers;

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if (observers !=null && observers.size()>0) {
            for (int i = 0; i < observers.size(); i++) {
                Observer observer =  observers.get(i);
                observer.response();
            }
        }
    }
}
