package com.xiaobai.designpattern.observerpattern;

import java.util.Vector;

/**
 * 抽象被观察者类
 *
 * @author 小白
 * @date 2019/8/2
 */
public abstract class AbstractSubject {
    private Vector<Observer> vector = new Vector<>();

    public void addObserver(Observer observer) {
        this.vector.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.vector.remove(observer);
    }

    public void notifyObservers() {
        for(Observer o : this.vector) {
            o.update();
        }
    }
}
