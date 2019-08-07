package com.xiaobai.designpattern.statepattern;

/**
 * 抽象状态类
 *
 * @author 小白
 * @date 2019/8/6
 */
public abstract class AbstractState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 行为1
     */
    public abstract void handle1();

    /**
     * 行为2
     */
    public abstract void handle2();
}
