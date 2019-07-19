package com.xiaobai.designpattern.mediatorpattern;

/**
 * 抽象中介者类
 *
 * @author 小白
 * @date 2019/7/19
 */
public abstract class AbstractMediator {
    /**
     * 同事类1
     */
    protected Colleague1 c1;

    /**
     * 同事类2
     */
    protected Colleague2 c2;

    /**
     * 中介类业务逻辑
     */
    public abstract void doSomething1();

    /**
     * 中介类业务逻辑
     */
    public abstract void doSomething2();

    public Colleague1 getC1() {
        return c1;
    }

    public Colleague2 getC2() {
        return c2;
    }

    public void setC1(Colleague1 c1) {
        this.c1 = c1;
    }

    public void setC2(Colleague2 c2) {
        this.c2 = c2;
    }
}
