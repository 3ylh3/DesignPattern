package com.xiaobai.designpattern.statepattern;

/**
 * 环境角色
 *
 * @author 小白
 * @date 2019/8/6
 */
public class Context {
    public final static AbstractState STATE1 = new State1();
    public final static AbstractState STATE2 = new State2();
    private AbstractState currentState;

    public void handle1() {
        this.currentState.handle1();
    }

    public void handle2() {
        this.currentState.handle2();
    }

    public void setCurrentState(AbstractState currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

    public AbstractState getCurrentState() {
        return currentState;
    }
}
