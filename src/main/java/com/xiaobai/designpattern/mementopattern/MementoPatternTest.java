package com.xiaobai.designpattern.mementopattern;

/**
 * 备忘录模式测试
 * 备忘录模式：在不破坏封装性的前提下， 捕获一个对象的内部状态， 并在该对象之外保存这个状态。
 * 这样以后就可将该对象恢复到原先保存的状态。
 *
 * @author 小白
 * @date 2019/8/5
 */
public class MementoPatternTest {
    public static void main(String[] args) {
        System.out.println("----备忘录模式----");
        Originator originator = new Originator();
        originator.setState("aaa");
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        System.out.println("state:" + originator.getState());
        originator.setState("bbb");
        System.out.println("state:" + originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("state:" + originator.getState());
    }
}
