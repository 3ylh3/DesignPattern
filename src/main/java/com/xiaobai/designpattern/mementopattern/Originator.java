package com.xiaobai.designpattern.mementopattern;

/**
 * TODO
 *
 * @author 小白
 * @date 2019/8/5
 */
public class Originator {
    private String state = "";

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        setState(memento.getState());
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
