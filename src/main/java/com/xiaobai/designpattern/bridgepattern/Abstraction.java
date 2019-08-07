package com.xiaobai.designpattern.bridgepattern;

/**
 * 抽象化角色
 *
 * @author 小白
 * @date 2019/8/7
 */
public abstract class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void request() {
        implementor.doSomething();
    }

    public Implementor getImplementor() {
        return implementor;
    }
}
