package com.xiaobai.designpattern.observerpattern;

/**
 * 被观察者实现类
 *
 * @author 小白
 * @date 2019/8/2
 */
public class Subject extends AbstractSubject {
    public void doSomething() {
        System.out.println("被观察者do something...");
        super.notifyObservers();
    }
}
