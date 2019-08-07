package com.xiaobai.designpattern.mementopattern;

/**
 * 备忘录管理员类
 *
 * @author 小白
 * @date 2019/8/5
 */
public class Caretaker {
    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
