package com.xiaobai.designpattern.observerpattern;

/**
 * 观察者模式测试
 * 观察者模式：定义对象间一种一对多的依赖关系， 使得每当一个对象改变状态，
 * 则所有依赖于它的对象都会得到通知并被自动更新。
 *
 * @author 小白
 * @date 2019/8/2
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new Observer1();
        subject.addObserver(observer);
        subject.doSomething();
    }
}
