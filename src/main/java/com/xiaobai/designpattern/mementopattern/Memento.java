package com.xiaobai.designpattern.mementopattern;

/**
 * 备忘录
 *
 * @author 小白
 * @date 2019/8/5
 */
public class Memento {
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
